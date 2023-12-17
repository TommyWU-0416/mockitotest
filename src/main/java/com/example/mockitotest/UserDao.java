package com.example.mockitotest;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public User getUserById(Integer id) {
        return new User(1, "John");
    }

    public Integer insertUser(User user) {
        return 22;
    }
}
