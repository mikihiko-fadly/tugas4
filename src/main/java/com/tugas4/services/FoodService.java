package com.tugas4.services;

import com.tugas4.models.Food;
import java.util.Arrays;
import java.util.List;

public class FoodService {
    public List<Food> getAllFoods() {
        return Arrays.asList(
            new Food(1, "Pizza", 80000L, "Medium"),
            new Food(2, "Burger", 50000L, "Large"),
            new Food(3, "Pasta", 60000L, "Small")
        );
    }
}
