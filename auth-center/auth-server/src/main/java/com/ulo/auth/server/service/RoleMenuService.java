package com.ulo.auth.server.service;

import com.ulo.auth.server.dao.IRoleMenuResp;
import com.ulo.auth.server.po.RoleMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleMenuService {

    @Autowired
    IRoleMenuResp iRoleMenuResp;


    public List<RoleMenu> findByRoleId(long roleId) {
        return iRoleMenuResp.findByRoleId(roleId);
    }
}
