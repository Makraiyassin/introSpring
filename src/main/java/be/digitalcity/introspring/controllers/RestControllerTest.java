package be.digitalcity.introspring.controllers;

import be.digitalcity.introspring.dto.PlayerDTO;
import be.digitalcity.introspring.services.PlayerService;
import be.digitalcity.introspring.utils.Poste;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping( "/api")
public class RestControllerTest {
    private final PlayerService playerService;

    public RestControllerTest(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public List<PlayerDTO> getPlayer(){
        return this.playerService.getAll();
    }
    @RequestMapping(path = "/first")
    public ResponseEntity<String> firstWebApiCall(){
        return ResponseEntity.ok("hello");
    }

}
