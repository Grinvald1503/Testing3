package com.example.testing3.services.impl;

import com.example.testing3.Dao.UserDao;
import com.example.testing3.Dao.impl.UserDaoImpl;
import com.example.testing3.model.User;
import com.example.testing3.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
private final UserDao userDao;

    @Override
    public boolean checkUserExist(User user) {
        return userDao.getUserByName(user.getName()) != null;
    }

}
