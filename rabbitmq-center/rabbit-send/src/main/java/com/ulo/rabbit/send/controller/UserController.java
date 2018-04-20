package com.ulo.rabbit.send.controller;

import com.ulo.rabbit.send.service.SendMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("send")
public class UserController {

    @Autowired
    SendMsgService sendMsgService;

    @RequestMapping("/msg/{send}")
    public String sendMsg(@PathVariable("send") String send){

       Boolean flag = sendMsgService.SendMsg(send);

       if(flag){
           return "正在处理中";
       }else{
           return "发送是吧";
       }

    }

}
