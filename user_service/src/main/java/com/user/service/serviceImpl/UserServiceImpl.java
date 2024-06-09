package com.user.service.serviceImpl;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<User> list = new ArrayList<>();

    public UserServiceImpl() {
        list.add(new User(1231L, "Vaibhav Bokade", "9874563214"));
        list.add(new User(1232L, "Chetan Radke", "9865471236"));
        list.add(new User(1233L, "Akshay Kale", "9632587412"));
    }

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
