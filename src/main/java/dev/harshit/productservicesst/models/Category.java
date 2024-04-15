package dev.harshit.productservicesst.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
//    private String description;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Product> products;
    // default fetch type of lists are lazy
}
