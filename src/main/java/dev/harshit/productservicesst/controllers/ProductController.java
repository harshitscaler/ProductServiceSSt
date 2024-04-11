package dev.harshit.productservicesst.controllers;

import dev.harshit.productservicesst.dtos.ExceptionDto;
import dev.harshit.productservicesst.dtos.FakeStoreProductDto;
import dev.harshit.productservicesst.models.Product;
import dev.harshit.productservicesst.services.FakeStoreProductService;
import dev.harshit.productservicesst.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        // we have to use try for exceptions and catch is also needed.
//        ResponseEntity<Product> responseEntity = null;
//        try{
//           Product product = productService.getProductById(id);
//           responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//            System.out.println("Hello");
//        }
//        catch(RuntimeException exception){
//           responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return responseEntity;

//        Product product = null;
//        try{
//             product = productService.getProductById(id);
//         responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//           System.out.println("Hello");
//        }catch(RuntimeException exception){
//            responseEntity = new ResponseEntity<>(product,HttpStatus.NOT_FOUND);
//        }
//        return responseEntity;
//        ResponseEntity<Product> responseEntity = null;
//        Product product = null;
//        try{
//            product = productService.getProductById(id);
//            responseEntity = new ResponseEntity<>(product,HttpStatus.OK);
//            System.out.println("Hello");
//            return  responseEntity;
//        }catch (RuntimeException exception){
//            ExceptionDto dto = new ExceptionDto();
//            dto.setMessage("Something went wrong");
//            ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto,HttpStatus.BAD_REQUEST);
//            return response;
//        }
        // this is not a good practice
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
