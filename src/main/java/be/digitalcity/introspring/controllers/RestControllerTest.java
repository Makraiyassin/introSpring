package be.digitalcity.introspring.controllers;

import be.digitalcity.introspring.dto.PlayerDTO;
import be.digitalcity.introspring.utils.Poste;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class RestControllerTest {

    @GetMapping("/api")
    public PlayerDTO getPlayer(){
        return new PlayerDTO().builder()
                .name("yassin")
                .birthDate(LocalDate.of(1992,6,21))
                .poste(Poste.ATTAQUANT)
                .number(9)
                .salary(3000)
                .build();
    }
}
