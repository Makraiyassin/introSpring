package be.digitalcity.introspring.entities;

import be.digitalcity.introspring.utils.Poste;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name")
    String name;

    @Column(columnDefinition = "DATE")
    LocalDate birthDate;

    @Column()
    int number;

    @Column()
    double salary;

    @Column
    @Enumerated(EnumType.STRING)
    Poste poste;
}
