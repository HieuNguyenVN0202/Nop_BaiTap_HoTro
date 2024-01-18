package com.example.btbotuc.service;

import com.example.btbotuc.model.Product;
import com.example.btbotuc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService  {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return  productRepository.getAllProduct();
    }

    public void addProduct(Product product) {
        productRepository.createProduct(product);
    }


}
