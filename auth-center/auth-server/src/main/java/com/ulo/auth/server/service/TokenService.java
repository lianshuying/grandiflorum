package com.ulo.auth.server.service;


import com.ulo.auth.server.po.RoleMenu;
import com.ulo.auth.server.po.User;
import com.ulo.auth.server.po.UserRole;
import com.ulo.auth.server.vo.Msg;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class TokenService {

    @Autowired
    private JwtTokenService jwtTokenService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private RoleMenuService roleMenuService;

    @Autowired
    RedisTemplate<String,String> redisTemplate;

    @Cacheable(value = "token",keyGenerator = "keyGenerator")
    public String createToken(Msg login_msg) {

             User user = (User) login_msg.getObj();
             //1.查询用户的角色
              List<UserRole> roles = userRoleService.findByUserId(user.getId());
              List<Long> roleIds = new ArrayList<>();
                      roles.forEach(roleId->{
                            roleIds.add(roleId.getRoleId());//角色Id集合
                      });
              //2.查询角色的菜单：将所有的角色
                List<Long> menus = new ArrayList<>();
                roleIds.forEach(roleId->{
                        List<RoleMenu> menu = roleMenuService.findByRoleId(roleId);
                                menu.forEach(_menu->{
                                    menus.add(_menu.getMenuId());//菜单Id集合
                                });
                });
             //将获取到的menus进行赛选去重复
                 List<Long> newList = new ArrayList(new HashSet(menus));

                String token = jwtTokenService.createJWT( user.getId(),user.getUserName(),roleIds,newList);

                 redisTemplate.opsForValue().set("vayne",token);

        return token;
    }


    public Claims parseJWT(String token) {

              return jwtTokenService.parseJWT(token);
    }




}
