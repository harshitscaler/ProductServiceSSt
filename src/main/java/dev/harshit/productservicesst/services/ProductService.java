package dev.harshit.productservicesst.services;

import dev.harshit.productservicesst.models.Product;

import java.util.List;

public interface ProductService {
     Product getProductById(Long id);
     List<Product> getAllProducts();
}
