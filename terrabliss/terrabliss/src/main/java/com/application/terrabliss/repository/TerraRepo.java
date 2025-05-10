package com.application.terrabliss.repository;

import com.application.terrabliss.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerraRepo extends MongoRepository<Product, String> {
}
