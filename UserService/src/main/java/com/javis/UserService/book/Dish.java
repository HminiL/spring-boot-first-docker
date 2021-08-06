package com.javis.UserService.book;

import lombok.Data;

@Data
public class Dish {
    private String description;
    private boolean delivered = false;

    public static Dish deliver(Dish dish){
        Dish deliverDish = new Dish(dish.description);
        deliverDish.delivered = true;
        return deliverDish;
    }

    Dish(String description){
        this.description = description;
    }
}
