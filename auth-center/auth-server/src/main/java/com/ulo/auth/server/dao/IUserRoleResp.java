package com.ulo.auth.server.dao;


import com.ulo.auth.server.po.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRoleResp extends CrudRepository<UserRole, Long> {

    @Query(value = "select * from system_user_role  where user_id = ?1 ",nativeQuery = true)
    List<UserRole> findByUserId(Long userId);
}
