package com.asrcore.bake_cost_pro.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "BakeCost Pro");
        model.addAttribute("message", "Bem-Vindo ao BakeCost Pro!");
        return "home";
    }
}
