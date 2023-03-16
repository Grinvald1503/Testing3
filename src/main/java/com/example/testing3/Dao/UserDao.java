package com.example.testing3.Dao;

import com.example.testing3.model.User;

public interface UserDao {
    User getUserByName(String user);

    String findAllUsers();
}
