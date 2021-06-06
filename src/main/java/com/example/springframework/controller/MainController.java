package com.example.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String helloPage(Model model) {
        model.addAttribute("name", "Alexander!");
        return "index";
    }
}
