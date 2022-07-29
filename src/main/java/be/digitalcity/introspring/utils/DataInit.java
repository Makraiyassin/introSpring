package be.digitalcity.introspring.utils;

import be.digitalcity.introspring.entities.Player;
import be.digitalcity.introspring.services.PlayerService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class DataInit implements InitializingBean {
    private final PlayerService playerService;

    private List<Player> playerList = Arrays.asList(
            Player.builder()
                    .name("Hazard")
                    .birthDate(LocalDate.of(1995,1,21))
                    .poste(Poste.ATTAQUANT)
                    .salary(500_000.00)
                    .number(7)
                    .build(),
            Player.builder()
                    .name("De Bruyn")
                    .birthDate(LocalDate.of(1994,1,21))
                    .poste(Poste.AVANT_DROIT)
                    .salary(600_000.00)
                    .number(10)
                    .build(),
            Player.builder()
                    .name("Meunier")
                    .birthDate(LocalDate.of(1996,1,21))
                    .poste(Poste.AVANT_GAUCHE)
                    .salary(300_000.00)
                    .number(14)
                    .build(),
            Player.builder()
                    .name("Courtois")
                    .birthDate(LocalDate.of(1998,1,21))
                    .poste(Poste.GARDIEN)
                    .salary(200_000.00)
                    .number(1)
                    .build(),
            Player.builder()
                    .name("Lukaku")
                    .birthDate(LocalDate.of(1990,1,21))
                    .poste(Poste.MILIEU_OFFENSIF)
                    .salary(100_000.00)
                    .number(9)
                    .build()
    );
    public DataInit(PlayerService playerService) {
        this.playerService = playerService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        playerList.forEach(playerService::insert);
    }
}
