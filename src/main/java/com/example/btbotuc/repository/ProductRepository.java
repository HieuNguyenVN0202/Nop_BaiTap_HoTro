package com.example.btbotuc.repository;

import com.example.btbotuc.model.Product;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    List<Product> products = new ArrayList<>();

    public ProductRepository() {
        Product product1 = new Product(1,"Samsung A17","Phone",1700000);
        Product product2 = new Product(2,"Samsung A37","Phone",2700000);
        Product product3 = new Product(3,"Samsung Z-Flip 5","Phone",22000000);

        products.add(product1);
        products.add(product2);
        products.add(product3);
    }

    public List<Product> getAllProduct() {
        return products;
    }

    public void createProduct(Product product) {
        products.add(product);
    }

}
