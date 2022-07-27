package be.digitalcity.introspring.controllers;

import be.digitalcity.introspring.services.PlayerService;
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
    public ModelAndView getAllPlayers(){
        ModelAndView mv = new ModelAndView("first.html");

        String msg = System.getenv("MESSAGE") == null ? "Spring" : System.getenv("MESSAGE");
        mv.addObject("message", msg);
        mv.addObject("infos", infos);
        return mv;
    }

}
