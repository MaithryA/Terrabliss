package com.application.terrabliss.service;

import com.application.terrabliss.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    User addUser(User user);

    List<User> getAllUsers();

    User getUserById(String id);

}
