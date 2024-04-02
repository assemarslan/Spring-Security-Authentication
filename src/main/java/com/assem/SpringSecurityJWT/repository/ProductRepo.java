package com.assem.SpringSecurityJWT.repository;

import com.assem.SpringSecurityJWT.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
