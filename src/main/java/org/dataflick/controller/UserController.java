package org.dataflick.controller;
import org.dataflick.controller.request.UserRequest;
import org.dataflick.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//add dependency in pom.xml for connect the
// spring boot web API to connect to server as RestCont, PostMap
// which was seen by the user as interface(online)---userregist
@RestController
public class UserController {
    @Autowired
    //autowired is used to make bin (internal obj for that class file-userSer..
    private UserService userService;

    //write many function inside it related the user
    //RESTAPI had many method -get(data get from user),set,post
    //PostMapping  method is used to post our user info
    @PostMapping("/user-registration")
    public void userRegistration(@RequestBody UserRequest request){
        System.out.println("Controller get the request from the user :: " + request);
        userService.save(request);

    }

}
