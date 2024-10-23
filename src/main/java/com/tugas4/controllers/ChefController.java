package com.tugas4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tugas4.services.ChefService;

@Controller
public class ChefController {
    private final ChefService chefService = new ChefService();

    @GetMapping("/list-chef")
    public String listChef(Model model) {
        model.addAttribute("chefs", chefService.getAllChefs());
        return "chef";
    }
}
