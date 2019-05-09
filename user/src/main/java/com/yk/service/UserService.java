package com.yk.service;

import com.yk.dao.UserDao;
import com.yk.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
     private UserDao userDao;
    public User findByUsernameAndPassword(String name, String password){
        User user = userDao.findBynameAndPassword(name,password);
        if(user!=null){
            return user;
        }else{
            return null;
        }
    }

}
