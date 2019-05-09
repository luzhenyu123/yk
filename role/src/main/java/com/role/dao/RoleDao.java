package com.role.dao;

import com.role.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleDao extends JpaRepository<Role, String>, JpaSpecificationExecutor<Role> {
}
