package com.application.terrabliss.serviceImpl;

import com.application.terrabliss.model.Product;
import com.application.terrabliss.repository.TerraRepo;
import com.application.terrabliss.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    TerraRepo repo;

    @Override
    public Product addProduct(Product product) {
        return (Product) repo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    @Override
    public Optional<Product> getProductById(String id) {
        return repo.findById(id);
    }
}
