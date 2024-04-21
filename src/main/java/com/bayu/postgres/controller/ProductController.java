package com.bayu.postgres.controller;

import com.bayu.postgres.dto.ProductRequest;
import com.bayu.postgres.model.Product;
import com.bayu.postgres.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest productRequest) {
        Product product = productService.createProduct(productRequest);

        return ResponseEntity.ok().body(product);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        List<Product> productList = productService.getAll();

        return ResponseEntity.ok().body(productList);
    }
}
