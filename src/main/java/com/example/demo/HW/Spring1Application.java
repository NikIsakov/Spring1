package com.example.demo.HW;

import com.example.demo.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Spring1Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);

        ProductService productService = context.getBean("productService", ProductService.class);
//
//        Product product = new Product(1, "1", 200);
//        Product product2 = new Product(2, "2", 400);
//        Product product3 = new Product(3, "3", 400);
//        List<Product> productList= new ArrayList<>();
//        productList.add(product);
//        productList.add(product2);
//        productList.add(product3);
//
//        System.out.println(totalProduct(productList));
//        System.out.println(averageCost(productList));



        System.out.println(productService.totalProduct());
        System.out.println(productService.averageCost());

        context.close();

    }

//    public static int totalProduct(List<Product> products){
//        return products.size();
//    }
//
//    public static float averageCost(List<Product> products){
//        float summ = 0.0F;
//        float average = 0.0F;
//        for (int i = 0; i<products.size(); i++) {
//            summ = summ + products.get(i).getCost();
//        }
//        return average = summ / totalProduct(products);
//    }

}
