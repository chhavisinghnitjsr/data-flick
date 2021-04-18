###### --//class import used(alt+enter)
###### --//go inside a function(ctrl+click)

# data-flick
A data quality validation framework
##### Flow of our Code
###### -> src
###### ----->main
###### -------->java
###### ------------>org.dataflick(Root level package)
>inside this many sub packages
0.  model
    ###### create a  package model(internal my API store user info)
    ###### inside model create a class User(used in userServies)
    ###### user get all the request(UserRequest) and also store extra info time,verified.

    
1.  controller 
    ###### controller is an RestAPI ,it get the all infromation from the server,where user gives the detail.
    ###### UserCont get all request from the server where some user used my appl.
    ###### User related function --reg/login/delete/..
    *   userController
        ###### ---> userRegistration
2.  dao
    *   userDao
    
3.  service
    ###### get that request of user and pass to service(UserService)->work on it,get from the controller(UserCont)
    ###### after service done the work ->need to get db /take db/..->dao(UserDao)
    * userService 
      


