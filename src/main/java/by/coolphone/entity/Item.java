package by.coolphone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private ProductPhone phone;
    @OneToOne
    private Bucket bucket;

    public Item(ProductPhone phone, Bucket bucket) {
        this.phone = phone;
        this.bucket = bucket;
    }
}
