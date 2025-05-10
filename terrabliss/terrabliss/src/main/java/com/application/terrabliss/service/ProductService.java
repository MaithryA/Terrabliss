package com.application.terrabliss.service;

import com.application.terrabliss.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product addProduct(Product product);

    List<Product> getAllProducts();

    Optional<Product> getProductById(String id);
}
