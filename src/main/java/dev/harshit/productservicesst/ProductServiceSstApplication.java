package dev.harshit.productservicesst;

import dev.harshit.productservicesst.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceSstApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProductServiceSstApplication.class, args);
        Product pr = new Product();
    }

}
