package dev.harshit.productservicesst.controllers;

import dev.harshit.productservicesst.dtos.FakeStoreProductDto;
import dev.harshit.productservicesst.models.Product;
import dev.harshit.productservicesst.services.FakeStoreProductService;
import dev.harshit.productservicesst.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// localhost::9090/products -> ProductController
@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    ProductController(@Qualifier("selfProductService") ProductService productService){

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
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
