package org.dataflick.controller.request;
//Request pakage inside the controller
//UserRequest is a class inside Request
//UserRq will work as get the user detail(UserController) and set the detail

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest {
    @JsonProperty("name")
    private String name;
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    @JsonProperty("phone_no")
    private String phoneNo;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

}
