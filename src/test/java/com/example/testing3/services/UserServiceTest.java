package com.example.testing3.services;

import com.example.testing3.Dao.UserDao;
import com.example.testing3.Dao.impl.UserDaoImpl;
import com.example.testing3.model.User;
import com.example.testing3.services.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.stereotype.Service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    private User kate = new User("Катя");
    private final String NAME = "Катя";

    @Mock
    private UserDao userDao;
    @InjectMocks
    private UserServiceImpl out;;
    @Test
    public void shouldRefundMethodTrue() {
        when(userDao.getUserByName(NAME)).thenReturn(kate);
        assertEquals(true, out.checkUserExist(kate));
    }
}
