package org.dataflick.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class UserController {
    @Autowired
    //autowired is used to make the obj for that class file-userSer..
    private UserServices userServices;

    @PostMapping("/User-Registration")

    public void userRegistration(){

    }

}
