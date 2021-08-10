package com.javis.UserService.product.controller;

import com.javis.UserService.product.service.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
public class ProductController {
    private final ProductServiceImpl productService;
}
