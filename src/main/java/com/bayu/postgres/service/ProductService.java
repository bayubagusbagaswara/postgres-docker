package com.bayu.postgres.service;

import com.bayu.postgres.dto.ProductRequest;
import com.bayu.postgres.model.Product;
import com.bayu.postgres.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public Product createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();

        productRepository.save(product);
        return product;
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
