package com.example.b12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping()
    public String showHomePage() {
        return "/home";
    }

    @GetMapping("/calculator")
    public String calculate(@RequestParam(name="number2") int number2,
                            @RequestParam(name="number1") int number1,
                            Model model) {

        int result = number2 + number1;
        model.addAttribute("SumTwoNumbers", result);
        return "/result";
    }
}
