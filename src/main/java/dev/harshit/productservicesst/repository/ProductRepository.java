package dev.harshit.productservicesst.repository;

import dev.harshit.productservicesst.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

// JPAREPOSITORY(Dtaytype, Datatype of primary key)
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Override

        // if product exist with id , it will return product else if it give null , optional will avoid you from getting null
    // open close principle , your code should be open for extension, and closed for modification
    Optional<Product> findById(Long id);
    @Override
    Product save(Product product);
}
