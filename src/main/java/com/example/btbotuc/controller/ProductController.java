package com.example.btbotuc.controller;

import com.example.btbotuc.model.Product;
import com.example.btbotuc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public String showHomePage(Model model) {
        List<Product> list = productService.getAllProducts();

        model.addAttribute("listProducts", list);

        return "/index";
    }

    @GetMapping("/add-product")
    public String showForm(Model model) {
        Product product = new Product();

        model.addAttribute("productList", product);

        return "/product/create";
    }

    @PostMapping("/create")
    public String createProduct(@ModelAttribute("productsList") Product product) {
        productService.addProduct(product);

        return "redirect:/product";
    }
}
