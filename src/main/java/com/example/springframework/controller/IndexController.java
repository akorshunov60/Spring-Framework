package com.example.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class IndexController {

    @ModelAttribute("activePage")
    String activePage() {
        return "index";
    }

    @GetMapping(value="/")
    public String index (Model model) {

        model.addAttribute("pageTitle", "Main");
        return "index";
    }
}
