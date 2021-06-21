package com.example.demo.HW;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class ProductDbRepository implements ProductRepository{
    @Override
    public List<Product> getProducts() {
        return new ArrayList<>();
    }
}
