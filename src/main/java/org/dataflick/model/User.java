package org.dataflick.model;

import java.util.Date;

//create package model inside  we create user  same as work as userreq
// but our API also store the user detail and extra add date,time,.
// need to make User.
public class User {
    private String fullName;
    private String userName;
    private String email;
    private String password;
    private String phoneNo;
    private Date createdAt;
    private boolean emailVerified;
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

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
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified){
        this.emailVerified = emailVerified();
    }

    private boolean emailVerified() {
        return true;
    }

}
