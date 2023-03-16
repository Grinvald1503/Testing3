package com.example.testing3.Dao.impl;

import com.example.testing3.Dao.UserDao;
import com.example.testing3.model.User;
import com.example.testing3.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    User kate = new User("Катя");
    User masha = new User("Маша");
    User vania = new User("Ваня");
    private final List<User> users = new ArrayList<>();

    public UserDaoImpl() {
        users.add(kate);
        users.add(masha);
        users.add(vania);
    }

    UserRepository userRepository;
@Override
    public User getUserByName(String user) {
        for (User value : users) {
            if (value.getName().equals(user)) {
                return value;
            }
        }
        return null;
    }
    @Override
    public String findAllUsers() {
        return users.toString();
    }
}
