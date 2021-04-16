package org.dataflick.service;
import org.dataflick.controller.request.UserRequest;
import org.dataflick.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void save( UserRequest newuser){
        System.out.println("Service get the request of newuser " + newsuer);


    }

}
