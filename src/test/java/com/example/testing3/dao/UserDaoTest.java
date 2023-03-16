package com.example.testing3.dao;

import com.example.testing3.Dao.UserDao;
import com.example.testing3.Dao.impl.UserDaoImpl;
import com.example.testing3.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDaoTest {
    User kate = new User("Катя");
    User alex = new User("Алексей");
    UserDaoImpl userDao = new UserDaoImpl();
    @Test
    public void shouldMethodReturnUser() {

        Assertions.assertEquals(kate, userDao.getUserByName(kate.getName()));
    }
    @Test
    public  void shouldMethodReturnNull() {
        Assertions.assertEquals(null, userDao.getUserByName(alex.getName()));
    }
}
