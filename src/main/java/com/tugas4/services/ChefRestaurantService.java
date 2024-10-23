package com.tugas4.services;

import com.tugas4.models.Chef;
import com.tugas4.models.ChefRestaurant;
import com.tugas4.models.Food;
import java.util.List;
import java.util.stream.Collectors;

public class ChefRestaurantService {
    private final FoodService foodService = new FoodService();
    private final ChefService chefService = new ChefService();

    public List<ChefRestaurant> getAllChefRestaurants() {
        List<Food> foods = foodService.getAllFoods();
        List<Chef> chefs = chefService.getAllChefs();

        return foods.stream()
            .map(food -> new ChefRestaurant(food, chefs.get(0)))
            .collect(Collectors.toList());
    }
}
