package be.digitalcity.introspring.mapper;

import be.digitalcity.introspring.dto.PlayerDTO;
import be.digitalcity.introspring.entities.Player;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class Mapper {
    public PlayerDTO toPlayerDto(Player entity){
        int age = Period.between(LocalDate.now() ,entity.getBirthDate()).getYears();
        return PlayerDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .birthDate(entity.getBirthDate())
                .poste(entity.getPoste())
                .number(entity.getNumber())
                .salary(entity.getSalary())
                .age(age)
                .build();
    }

    public Player toPlayerEntity(PlayerDTO dto){
        return null;
    }
}
