package org.dataflick.model;

public class DataSourceRequest {
    private String name;
    private String url;
    private String user;
    private String password;


    public void getName(String name) {
        this.name = name;
    }

    public void getUrl(String url) {
        this.url = url;
    }
    public void getUser(String user) {
        this.user = user;
    }

    public void getPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String url) {
        this.user = user;
    }

    public void setPassword(String url) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "name: " + name + ", user: " + user+ "url: "+url+", password: "+password;
    }

}
