package dev.harshit.productservicesst.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category {
    @Id
    private Long id;
    private String title;
    private String description;
    @OneToMany
    private List<Product> products;

}
