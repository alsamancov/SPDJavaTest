package com.springapp.mvc.repository;


import com.springapp.mvc.entity.User;

import java.util.List;

public interface UserDao {
    public void insert(User user);
    public void deleteUser(int id);
    public List<User> getAll();
}
