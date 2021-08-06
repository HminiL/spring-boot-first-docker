package com.javis.UserService.item.repository;

import com.javis.UserService.item.entity.Cart;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CartRepository extends ReactiveCrudRepository<Cart, String> {
}
