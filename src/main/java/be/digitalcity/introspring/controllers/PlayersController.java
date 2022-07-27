package be.digitalcity.introspring.controllers;


import be.digitalcity.introspring.services.PlayerService;
import org.springframework.stereotype.Controller;
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
}
