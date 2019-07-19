package model;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="product")
public class Product {

    // Primary Key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Name field
    @Column(name="name")
    private String name;

    // Price field
    @Column(name="price")
    private Double price;

    // Explanation field
    @Column(name="explanation")
    private String explanation;
}
