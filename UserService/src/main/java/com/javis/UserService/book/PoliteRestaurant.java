package com.javis.UserService.book;

public class PoliteRestaurant {
/*
* 구독(Subscription)을 하기 전에는 어떤 연산도 일어나지 않는다
*
* */
    public static void main(String... arg){
        PoliteServer server = new PoliteServer(new KitchenService());

        server.doingMyjob().subscribe(
                dish -> System.out.println(dish + "먹었다" ),
                throwable -> System.err.println(throwable));
    }
}
