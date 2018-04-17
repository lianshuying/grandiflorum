package com.ulo.auth.server.service;

import com.ulo.auth.server.dao.ILoginResp;
import com.ulo.auth.server.po.User;
import com.ulo.auth.server.vo.Msg;
import com.ulo.auth.server.vo.UserInfoVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    private static Logger log = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    private ILoginResp _iLoginResp;

    public Msg validateLogin( UserInfoVo userInfoVo) {

        Msg msg = new Msg();
        List<User> list = _iLoginResp.findByUserNameAndPassword(userInfoVo.getUserName(),userInfoVo.getPassWord());
                if(list.size()==0){//用户不存在
                    msg.setCode("404");
                    msg.setFlag(false);
                    msg.setMsg("用户名或密码错误");
                }else if(list.size()==1){
                    msg.setObj(list.get(0));
                }else{
                    msg.setCode("500");
                    msg.setFlag(false);
                    msg.setMsg("系统异常");
                }
        return msg;
    }
}
