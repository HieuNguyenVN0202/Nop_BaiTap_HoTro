package com.example.congtrunhanchia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping()
    public String CongTruNhanChia() {
        return "/home";
    }

    @PostMapping("/calculate")
    public String calculator(@RequestParam("number1") int number1,
                             @RequestParam("number2") int number2,
                             @RequestParam("option") String option,
                             Model model) {

        int result = 0;
        switch (option) {
            case "Cộng":
                result = number1 + number2;
                break;
            case "Trừ":
                result = number1 - number2;
                break;
            case "Nhân":
                result = number1 * number2;
                break;
            case "Chia":
                result = number1 / number2;
                break;
        }
        String path = "/result";
        model.addAttribute("results", result);
        return path;

    }
}
