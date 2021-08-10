package com.javis.UserService.product.service;

import com.javis.UserService.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class ProductServiceImpl {
    private final ProductRepository productRepository;
}
