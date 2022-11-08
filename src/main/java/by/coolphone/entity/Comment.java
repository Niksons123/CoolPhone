package by.coolphone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private LocalDateTime creation;
    private Integer rating;
    @OneToOne
    private Phone phone;
    @OneToOne
    private User user;

    public Comment(String description, LocalDateTime creation, Integer rating, Phone phone, User user) {
        this.description = description;
        this.creation = creation;
        this.rating = rating;
        this.phone = phone;
        this.user = user;
    }
}
