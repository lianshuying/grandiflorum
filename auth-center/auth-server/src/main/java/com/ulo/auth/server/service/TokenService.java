package com.ulo.auth.server.service;

import com.ulo.auth.server.po.User;
import com.ulo.auth.server.vo.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Autowired
    private JwtTokenService jwtTokenService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private UserPrivileges userPrivileges;

    public Msg createToken(Msg login_msg) {
             Msg msg = new Msg();

             User user = (User) msg.getObj();

             String userName = user.getUserName();

                    //1.查询用户的角色
              String roles = userRoleService.findByUserName(userName).toString();
                    //2.查询用户的权限
              String privileges = userPrivileges.findByUserName(userName).toString();

              String token = jwtTokenService.createJWT(userName,roles,privileges);

             msg.setObj(token);

        return msg;
    }
}
