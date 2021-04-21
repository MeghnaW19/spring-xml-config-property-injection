package com.stackroute.domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Dish> dish;

    public Menu() {
    }

    public List<Dish> getDish() {
        return dish;
    }

    public void setDish(List<Dish> dish) {
        this.dish = dish;
    }
}
