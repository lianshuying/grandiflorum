package com.ulo.auth.server.controller;

import com.ulo.auth.server.po.User;
import com.ulo.auth.server.service.LoginService;
import com.ulo.auth.server.service.TokenService;
import com.ulo.auth.server.vo.Msg;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录请求Token
 */
@RestController
@RequestMapping(value = "login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private TokenService tokenService;


    /**
     * 获取Token
     * @param
     * @param
     * @param request
     * @return
     */
    @RequestMapping(value = "/getToken",method = RequestMethod.POST)
    public Msg login(HttpServletRequest request, @RequestBody User user){

        //1.验证userName和Password
        Msg login_msg  = loginService.validateLogin(user);
        Msg token_msg = new Msg();

        if(login_msg.isFlag()){
            //2.创建Token
            token_msg = tokenService.createToken(login_msg);
        }else{
            return login_msg;
        }

        return token_msg;
    }


    /**
     * 解析Token
     * @param
     * @return
     */
    @RequestMapping(value = "/parseToken/{token}",method = RequestMethod.GET)
    public Claims parseJWT(HttpServletRequest request,@PathVariable("token") String token){

        Claims claims = tokenService.parseJWT(token);
        return claims;
    }


}
