package com.ulo.operation.center.service.impl;

import com.ulo.operation.center.dao.UserDao;
import com.ulo.operation.center.entity.User;
import com.ulo.operation.center.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

        @Autowired
        private UserDao userDao;

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

            return userDao.insert(username,password);
        }



}
