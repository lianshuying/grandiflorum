package com.ulo.auth.server.controller;

import com.ulo.auth.server.service.LoginService;
import com.ulo.auth.server.service.TokenService;
import com.ulo.auth.server.vo.Msg;
import com.ulo.auth.server.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public Msg login(HttpServletRequest request, @RequestBody UserInfoVo userInfoVo){

        //1.验证userName和Password
        Msg login_msg  = loginService.validateLogin(userInfoVo);

            //2.创建Token
        Msg token_msg = tokenService.createToken(login_msg);

        return token_msg;
    }



}
