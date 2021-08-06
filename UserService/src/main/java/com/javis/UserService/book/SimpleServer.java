package com.javis.UserService.book;

import com.javis.UserService.book.Dish;
import com.javis.UserService.book.KitchenService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class SimpleServer {
    private final KitchenService kitchen;

    Flux<Dish> doingMyJob(){
        return this.kitchen.getDishes()
                .map(dish -> Dish.deliver(dish));
    }
}
