package com.application.terrabliss.controller;

import com.application.terrabliss.model.Product;
import com.application.terrabliss.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class TerraController {

    @Autowired
    ProductService pService;

    @MutationMapping
    public Product addProduct(@Argument Product product){
        return pService.addProduct(product);
    }

    @QueryMapping
    public Optional<Product> getProductById(@Argument("productId") String id){
        return pService.getProductById(id);
    }

    @QueryMapping
    public List<Product> getAllProducts(){
        return pService.getAllProducts();
    }
}
