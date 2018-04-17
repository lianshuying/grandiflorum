package com.ulo.auth.server.service;

import com.ulo.auth.server.dao.IUserRoleResp;
import com.ulo.auth.server.po.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService {

    @Autowired
    IUserRoleResp iUserRoleResp;



    public List<UserRole> findByUserId(Long userId) {
        return iUserRoleResp.findByUserId(userId);
    }
}
