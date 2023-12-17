package com.example.mockitotest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * 在 JUnit 5 中推薦使用
 *
 * @ExtendWith(SpringExtension.class) 替代 @RunWith(SpringRunner.class)
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest

@ExtendWith(SpringExtension.class)
@SpringBootTest()
public class UserServiceTest {

    //先普通的注入一個userService bean
    @Autowired
    private UserService userService;

    @Test
    public void getUserById() throws Exception {
        //普通的使用userService，他裡面會再去call userDao取得DB的data
        User user = userService.getUserById(1);

        //檢查結果
        assertNotNull(user);
        assertEquals(user.getId(), Integer.valueOf(1));
        assertEquals(user.getName(), "aa");
    }
}