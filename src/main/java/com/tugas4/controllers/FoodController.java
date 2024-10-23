package com.tugas4.controllers;

import com.tugas4.models.Food;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FoodController {

    @GetMapping("/list-food")
    public String listFood(Model model) {
        List<Food> foods = new ArrayList<>();
        foods.add(new Food(1, "Chicken steak", 23000L, "sedang"));
        foods.add(new Food(2, "Kentang goreng", 19000L, "besar"));
        foods.add(new Food(3, "Ayam geprek", 25000L, "kecil"));
        foods.add(new Food(4, "Nasi goreng", 24000L, "sedang"));

        model.addAttribute("foods", foods);
        return "food";
    }
}
