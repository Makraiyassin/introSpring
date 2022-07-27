package be.digitalcity.introspring.services;

import be.digitalcity.introspring.dto.PlayerDTO;
import be.digitalcity.introspring.entities.Player;
import be.digitalcity.introspring.mapper.Mapper;
import be.digitalcity.introspring.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlayerService implements Iservice<Player,PlayerDTO,Long> {

    private final PlayerRepository playerRepository;
    private final Mapper mapper;

    public PlayerService(PlayerRepository playerRepository, Mapper mapper) {
        this.playerRepository = playerRepository;
        this.mapper = mapper;
    }


    @Override
    public List<PlayerDTO> getAll() {
        return this.playerRepository
                .findAll()
                .stream()
                .map(mapper::toPlayerDto)
                .collect(Collectors.toList());
    }

    @Override
    public PlayerDTO getById(Long id) {
        Optional<Player> optional = this.playerRepository.findById(id);
        return optional.map(mapper::toPlayerDto).orElse(null); //optional.isPresent() ?mapper.toPlayerDto(optional.get()) : null;
    }

    @Override
    public PlayerDTO insert(Player player) {
        if(player == null) throw new RuntimeException("Erreur, player null");
        return this.mapper.toPlayerDto(this.playerRepository.save(player));
    }

    @Override
    public void update(Player player) {

    }

    @Override
    public void delete(Long id) {

    }
}
