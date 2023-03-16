package com.example.testing3.repository;

import com.example.testing3.model.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public Collection<User> getAllUsers() {
        return users;
    }


}
