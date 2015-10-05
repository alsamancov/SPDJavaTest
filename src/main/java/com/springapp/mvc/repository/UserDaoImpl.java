package com.springapp.mvc.repository;

import com.springapp.mvc.entity.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void insert(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);

    }

    @Override
    public void deleteUser(int id) {
        User user = (User) sessionFactory.getCurrentSession().load(
                User.class, id);
        if(null != user){
            this.sessionFactory.getCurrentSession().delete(user);
        }

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getAll() {
        Query query = sessionFactory.getCurrentSession().createQuery("from User");
        return query.list();
    }
}
