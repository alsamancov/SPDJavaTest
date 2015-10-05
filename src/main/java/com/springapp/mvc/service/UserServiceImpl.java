package com.springapp.mvc.service;


import com.springapp.mvc.entity.User;
import com.springapp.mvc.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    @Transactional
    public List<User> getAll() {
        return userDao.getAll();

    }
}
