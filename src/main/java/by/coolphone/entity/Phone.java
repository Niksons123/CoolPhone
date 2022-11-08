package by.coolphone.entity;

import by.coolphone.entity.enums.DisplayType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "phones")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private LocalDate releaseDate;
    private int ram;
    private int rom;
    private String color;
    private double displaySize;

    @Enumerated(EnumType.STRING)
    private DisplayType displayType;
}

