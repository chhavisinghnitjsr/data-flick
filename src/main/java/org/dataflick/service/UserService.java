package org.dataflick.service;
import org.dataflick.controller.request.UserRequest;
import org.dataflick.dao.UserDao;
import org.dataflick.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void save( UserRequest newUser){
        System.out.println("Service get the request of newuser " + newUser);
        int id = 1;
        User user = new User();
        user.setId(id);
        user.setFullName(newUser.getFullName());
        user.setUserName(newUser.getUserName());
        user.setEmail(newUser.getEmail());
        user.setPassword(newUser.getPassword());
        user.setPhoneNo(newUser.getPhoneNo());
        user.setCreatedAt(new Date());
        user.setEmailVerified(false);
        userDao.createUser(user);


    }

}
