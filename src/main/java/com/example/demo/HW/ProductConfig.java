package com.example.demo.HW;

import com.example.demo.Box;
import com.example.demo.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.example.demo.HW")
public class ProductConfig {

    @Autowired
    private ProductService productService;

    @Bean
    public BoxProducts box1() {
        BoxProducts box = new BoxProducts();
        box.setProductService(productService);
        box.setSize(5);
        return box;
    }

    public Product product1() {
        Product product = new Product(1, "1",100);
        return product;
    }
}
