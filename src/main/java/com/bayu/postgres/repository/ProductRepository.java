package com.bayu.postgres.repository;

import com.bayu.postgres.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
