package com.javis.UserService.util;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Data final class Product{
    private final int productId;
    private final String description;
}

public final class ObjectArray {

    public Product[] createCart() {
        Product[] cart = new Product[5];
        String[] productNames = {"Coffee", "Computer","Apple","Dress","Fairy-tale book"};

//        Product p1 = new Product(101, "Coffee");
//        Product p2 = new Product(202, "Computer");
//        Product p3 = new Product(303, "Apple");
//        Product p4 = new Product(404, "Dress");
//        Product p5 = new Product(505, "Fairy-tale book");

        int j = 0;
        for(int i = 0; i<cart.length; i++){
            cart[j] = new Product((i+1)*101, productNames[i]);
            j++;
        }
        return cart;
    }
}
