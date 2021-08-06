package com.javis.UserService.book;

import reactor.core.publisher.Flux;
/*
 * Future 의 리턴타입은 Scalar 이다
 * Flux 의 리턴타입은 Vector 이다
 * just()를 통해 비동기적으로 제공한다(만들자마자...)
 * */
public class KitchenService {
    Flux<Dish> getDishes() {
        return Flux.just(new Dish("치킨"), new Dish("noodle"),new Dish("beef"));
    }
}
