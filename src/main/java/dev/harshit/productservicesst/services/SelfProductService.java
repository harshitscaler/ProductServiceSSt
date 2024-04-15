package dev.harshit.productservicesst.services;

import dev.harshit.productservicesst.exceptions.CategoryNotFoundException;
import dev.harshit.productservicesst.exceptions.ProductNotFoundException;
import dev.harshit.productservicesst.models.Category;
import dev.harshit.productservicesst.models.Product;
import dev.harshit.productservicesst.repository.CategoryRepository;
import dev.harshit.productservicesst.repository.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@Primary
public class SelfProductService implements ProductService{

    /// if we use new , then it will take lot of space , and it will call mutiple times.,  an dif we have to change from sql to no sql then it will disadvantage and code is not maintable

    private ProductRepository productRepository ;
    // you have to change it again you have to change from 100 places , thats why
    private CategoryRepository categoryRepository;

    SelfProductService(ProductRepository productRepository,CategoryRepository categoryRepository) {
        this.productRepository =   productRepository;
        this.categoryRepository=categoryRepository;
    }
    @Override
    public Product getProductById(Long id) {
        Optional<Product> optionalProduct=  productRepository.findById(id);
        if(optionalProduct.isEmpty()){
            throw new ProductNotFoundException(id,"Product not found");
        }
        // return directly without storing in  a variable
        return optionalProduct.get();
    }
    @Override
    public List<Product> getAllProducts() {

        return null;
    }

    @Override
    public Product createProduct(Product product) {
        Category category = product.getCategory();
        if(category.getId()==null){
            category = categoryRepository.save(category);
            product.setCategory(category);
        }
        Product product1 = productRepository.save(product);
        Optional<Category> optionalCategory = categoryRepository.findById(category.getId());

        if(optionalCategory.isEmpty()){
            throw new CategoryNotFoundException("Invalide category id passed");
        }
        product1.setCategory(optionalCategory.get());
        return product1;

    }
}
