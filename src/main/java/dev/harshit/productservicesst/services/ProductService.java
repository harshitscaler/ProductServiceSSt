package dev.harshit.productservicesst.services;

import dev.harshit.productservicesst.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface ProductService {
     Product getProductById(Long id);
     List<Product> getAllProducts();

      Product createProduct(Product product);

}
