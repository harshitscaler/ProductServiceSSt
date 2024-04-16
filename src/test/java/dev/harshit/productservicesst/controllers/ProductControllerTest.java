package dev.harshit.productservicesst.controllers;

import dev.harshit.productservicesst.models.Product;
import dev.harshit.productservicesst.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
// this becomes spring boot test file
class ProductControllerTest {
    // go to class right click , generate test and then click
    // what to test??
    // Happy test case , negative test case , edge cases
    @Autowired  // dependency injection , thiserror is coming
    // field injection
    private  ProductController productController;
    @MockBean
    private ProductService productService;
    @Test
    void testValidProductId() {

        Product product = new Product();
        product.setId(1L);
        product.setTitle("iphone 15");
        product.setPrice(100000.0);
        // mock the product service call .
//        Product product = productController.getProductById(1L);
        when(productService.getProductById(1L)).thenReturn(product);

        Product outPutProduct = productController.getProductById(1L);
        System.out.println(product.getImage());
        System.out.println(outPutProduct.getImage());
        System.out.println("DEBUG");
        assertEquals(product,outPutProduct);
    }
    @Test
    void testInvalidProductId(){

    }
    @Test
    void getAllProducts() {
    }

    @Test
    void createProduct() {
    }
}