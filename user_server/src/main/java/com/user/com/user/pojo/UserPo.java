package com.user.com.user.pojo;

import java.io.Serializable;

public class UserPo implements Serializable {
    private int id;
    private String username;
    private String password;
    private int age;

    public UserPo() {
    }

    public UserPo(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
