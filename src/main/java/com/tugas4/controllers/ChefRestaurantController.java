package com.tugas4.controllers;

import com.tugas4.services.ChefRestaurantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChefRestaurantController {
    private final ChefRestaurantService chefRestaurantService = new ChefRestaurantService();

    @GetMapping("/chef-restaurant")
    public String listChefRestaurant(Model model) {
        model.addAttribute("chefRestaurants", chefRestaurantService.getAllChefRestaurants());
        return "chef-restaurant";
    }
}
