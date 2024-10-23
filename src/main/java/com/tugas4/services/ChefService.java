package com.tugas4.services;

import com.tugas4.models.Chef;
import java.util.Arrays;
import java.util.List;

public class ChefService {
    public List<Chef> getAllChefs() {
        return Arrays.asList(
            new Chef(1, "Hilwa", "Jateng"),
            new Chef(2, "Arya", "Riau"),
            new Chef(3, "Riri", "Jabar")
        );
    }
}
