package be.digitalcity.introspring.controllers;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class FirstController {
    List<String> infos = Arrays.asList(
            "toto",
            "tutu",
            "tata"
    );
    @RequestMapping(path = "/first", method = RequestMethod.GET)
    public ModelAndView firstCall(){
        ModelAndView mv = new ModelAndView("first");

        Dotenv dotenv = Dotenv.load();
        String msg = System.getenv("MESSAGE");
        mv.addObject("message", msg);
        mv.addObject("infos", infos);
        return mv;
    }

}
