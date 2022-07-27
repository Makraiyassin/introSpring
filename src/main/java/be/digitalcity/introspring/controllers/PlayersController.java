package be.digitalcity.introspring.controllers;


import be.digitalcity.introspring.services.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/player")
public class PlayersController {
    private final PlayerService playerService;

    public PlayersController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @RequestMapping(path = "/all")
    public ModelAndView getAllPlayers(){
        ModelAndView mv = new ModelAndView("player/all");
        mv.addObject("players", this.playerService.getAll());
        return mv;
    }
    @RequestMapping(path = "/one/{id}")
    public ModelAndView getOnePlayer(@PathVariable Long id){
        ModelAndView mv = new ModelAndView("player/one");
        mv.addObject("player", this.playerService.getById(id));
        return mv;
    }

    @RequestMapping(path = "/insert")
    public ModelAndView insertPlayers(){
        ModelAndView mv = new ModelAndView("player/insert");
        return mv;
    }
}
