package com.example.demo.HW;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public int totalProduct(){
        List<Product> products = productRepository.getProducts();
        return products.size();
    }

    public float averageCost(){
        List<Product> products = productRepository.getProducts();
        float summ = 0.0F;
        float average = 0.0F;
        for (int i = 0; i<products.size(); i++) {
            summ = summ + products.get(i).getCost();
        }
        return average = summ / totalProduct();
    }


}
