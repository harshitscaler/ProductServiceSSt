package dev.harshit.productservicesst.controllers;

import dev.harshit.productservicesst.dtos.FakeStoreProductDto;
import dev.harshit.productservicesst.models.Product;
import dev.harshit.productservicesst.services.FakeStoreProductService;
import dev.harshit.productservicesst.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// localhost::9090/products -> ProductController
@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    ProductController(ProductService productService){
        this.productService = productService;
    }
    //localhost:8080/products/get/10
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }
    @GetMapping("/")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
