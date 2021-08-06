package com.javis.UserService.item.repository;

import com.javis.UserService.item.entity.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ItemRepository extends ReactiveCrudRepository<Item, String> {
}
