package com.example.demo.HW;

import com.example.demo.Student;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component(value = "inMemory")
public class ProductInMemoryRepository implements ProductRepository{
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1, "Товар 1", 100));
        products.add(new Product(2, "Товар 2", 200));
    }

    @Override
    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public void add(Product product){
        products.add(product);
    }

    public void remove(Product product){
        products.remove(product);
    }

    public void read(int id){
        products.get(id).toString();
    }

    public void changeId(List<Product> products, int id, int newId){
        Product product = products.get(id);
        product.setId(newId);
    }

    public void changeTitle(List<Product> products, int id, String newTitle){
        Product product = products.get(id);
        product.setTitle(newTitle);
    }

    public void changeCost(List<Product> products, int id, float newCost){
        Product product = products.get(id);
        product.setCost(newCost);
    }

}
