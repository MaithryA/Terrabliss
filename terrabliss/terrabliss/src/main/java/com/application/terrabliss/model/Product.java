package com.application.terrabliss.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "product")
public class Product {
    @Id
    private String productId;
    private String name;
    private Categories category;
    private Integer stock;
    private Boolean available;
}
