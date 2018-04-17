package com.ulo.auth.server.dao;

import com.ulo.auth.server.po.RoleMenu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoleMenuResp extends CrudRepository<RoleMenu, Long> {

    @Query(value = "select * from system_role_menu  where role_id = ?1 ",nativeQuery = true)
    List<RoleMenu> findByRoleId(Long roleId);
}
