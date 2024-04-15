package dev.harshit.productservicesst;

import dev.harshit.productservicesst.models.Category;
import dev.harshit.productservicesst.models.Product;
import dev.harshit.productservicesst.repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class ProductServiceSstApplicationTests {
    @Autowired
    private CategoryRepository categoryRepository;
    @Test
    void contextLoads() {
    }
//    @Test
//    void testEagerVsLazyFetch(){
//      Optional<Category> optionalCategory = categoryRepository.findById(1L);
//    Category category = optionalCategory.get();
//     System.out.println("Fetching lists");
//       List<Product> products = category.getProducts();
////       System.out.println(products.get(0).getTitle());
//        System.out.println("DEBUG");
//    }



}
