package com.example.mockitotest;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserServiceTestWithMockito {

    @Autowired
    private UserService userService;

    @MockBean
    private UserDao userDao;

    @Test
    public void getUserById() throws Exception {
        // 定義當調用mock userDao的getUserById()方法，並且參數為3時，就返回id為200、name為I'm mock3的user對象
        Mockito.when(userDao.getUserById(3)).thenReturn(new User(200, "I'm mock 3"));

        // 返回的會是名字為I'm mock 3的user對象
        User user = userService.getUserById(3);

        assertNotNull(user);
        assertEquals(user.getId(), Integer.valueOf(200));
        assertEquals(user.getName(), "I'm mock 3");
    }
}