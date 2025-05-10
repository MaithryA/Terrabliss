package com.application.terrabliss.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="user")
public class User {

    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private Address address;
    private String cartId;
}
