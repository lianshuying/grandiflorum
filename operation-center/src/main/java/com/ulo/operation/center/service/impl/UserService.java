package com.ulo.operation.center.service.impl;

import com.ulo.operation.center.dao.UserMapper;
import com.ulo.operation.center.entity.User;
import com.ulo.operation.center.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {


        @Autowired
        private UserMapper userDao;

        @Override
        public int testInterFace() {
            return 0;
        }

        @Override
        public User testUser() {
            return  new User();
        }

        @Override
        public int insertUser(String username, String password) {

            return userDao.insertUser(username,password);
        }

        @Override
        public  List<User> findById(){
           return  userDao.selectAll();
        }


}
