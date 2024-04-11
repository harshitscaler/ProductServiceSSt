package dev.harshit.productservicesst.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private double price;
    @ManyToOne
    private Category category;
    private String image;
    private int qty;
//    Product(Long id,String title,String description,Double price,Category category,String image){
//        this.id = id;
            // the default constructor can be made using @AllArgsConstructor
//    }

}
