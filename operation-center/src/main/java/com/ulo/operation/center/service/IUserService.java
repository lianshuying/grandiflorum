package com.ulo.operation.center.service;

import com.ulo.operation.center.entity.User;

import java.util.List;

public interface IUserService {


    public int testInterFace();

    public User testUser();

    public int insertUser(String username,String password);//新增的接口

    public List<User> findById();

}
