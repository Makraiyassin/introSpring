package be.digitalcity.introspring.dto;

import be.digitalcity.introspring.utils.Poste;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerDTO {
    Long id;
    String name;
    LocalDate birthDate;
    int age;
    int number;
    double salary;
    Poste poste;
}
