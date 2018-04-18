package com.ulo.operation.center.controller;

import com.ulo.operation.center.entity.User;
import com.ulo.operation.center.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/get")
    User getUser() {
        return iUserService.testUser();
    }

    //增加新的对外访问接口
    @RequestMapping("/add")
    String add() {
        iUserService.insertUser("username123寇鑫","password123寇鑫");
        return "插入成功";
    }


    @RequestMapping("/find")
    List<?> findByd() {

            List<User>  list = iUserService.findById();
        return list;
    }


}
