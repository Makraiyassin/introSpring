package be.digitalcity.introspring.repositories;

import be.digitalcity.introspring.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

}
