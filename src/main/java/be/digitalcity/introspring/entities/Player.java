package be.digitalcity.introspring.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

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

    @Column()
    String name;
}
