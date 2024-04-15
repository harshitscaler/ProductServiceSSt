package dev.harshit.productservicesst;

import dev.harshit.productservicesst.models.Category;
import dev.harshit.productservicesst.models.Product;
import dev.harshit.productservicesst.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.text.html.Option;
import java.util.Optional;

@SpringBootApplication
public class ProductServiceSstApplication {
    public static void main(String[] args) {

        SpringApplication.run(ProductServiceSstApplication.class, args);
//        Optional<Category> categoryOptional = categoryRepository.findById(1L);
    }

}
