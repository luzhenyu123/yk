package com.yk.dao;

import com.yk.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao  extends
        JpaRepository<User,String>, JpaSpecificationExecutor<User> {

    User findBynameAndPassword(String name, String password);
}
