package org.dataflick.model;

import org.dataflick.core.DBSystem;
import org.dataflick.core.SourceType;


public class DataSource {
    private String name;
    private String url;
    private String user;
    private String password;
    private SourceType sourceType;
    private DBSystem dbSystem;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", sourceType=" + sourceType +
                ", dbSystem=" + dbSystem +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public DBSystem getDbSystem() {
        return dbSystem;
    }

    public void setDbSystem(DBSystem dbSystem) {
        this.dbSystem = dbSystem;
    }
}
