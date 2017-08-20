package com.joegl.dao;

import com.joegl.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Long> {
    Role findByName(String name);
}
