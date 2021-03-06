package org.dataflick.controller.request;
//Request pakage inside the controller
//UserRequest is a class inside Request
//UserRq will work as get the user detail(UserController) and set the detail

public class UserRequest {
    private String fullName;
    private String userName;
    private String email;
    private String password;
    private String phoneNo;

    public String getFullName(){
        return  fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
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
