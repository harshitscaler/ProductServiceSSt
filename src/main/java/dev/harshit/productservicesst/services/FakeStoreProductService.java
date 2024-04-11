package dev.harshit.productservicesst.services;

import dev.harshit.productservicesst.dtos.FakeStoreProductDto;
import dev.harshit.productservicesst.exceptions.ProductNotFoundException;
import dev.harshit.productservicesst.models.Category;
import dev.harshit.productservicesst.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductService{
    @Override
    public Product getProductById(Long id) {
        // Call the FakeStoreAPI to get the product with give id
        // Resttemplate is used for calling from 3 rd party api

        RestTemplate restTemplate = new RestTemplate();
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductDto.class);
        // convert Fakestroe dto object to product object
        if(fakeStoreProductDto==null){
            throw new ProductNotFoundException(id, "Please pass a valid productId");
        }
        return convertFakeStoreProductDtoToProduct(fakeStoreProductDto);
    }
    public List<Product> getAllProducts(){
        RestTemplate restTemplate = new RestTemplate();
        FakeStoreProductDto[] fakeStoreProductDtos = restTemplate.getForObject("http://fakestoreapi.com/products",FakeStoreProductDto[].class);
//        List list = new ArrayList();
//        list.add("Scaler");
        List<Product> products = new ArrayList<>();
        for(FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos){
            products.add(convertFakeStoreProductDtoToProduct(fakeStoreProductDto));
        }
        return products;
    }

    @Override
    public Product createProduct(Product product) {

        return null;
    }

//    @Override
//    public Product createProduct(Product product) {
//        return null;
//    }

    private Product convertFakeStoreProductDtoToProduct(FakeStoreProductDto fakeStoreProductDto){
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setImage(fakeStoreProductDto.getImage());
        Category category = new Category();
        category.setDescription(fakeStoreProductDto.getCategory());
        product.setCategory(category);
        return  product;
    }
}
