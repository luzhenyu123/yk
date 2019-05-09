package com.role.service;

import com.role.dao.RoleDao;
import com.role.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleService {
    @Autowired
    private RoleDao roleDao;
    /**
     * 查询全部标签
     *
     * @return
     */
    public List<Role> findAll() {
        return roleDao.findAll();
    }
}
