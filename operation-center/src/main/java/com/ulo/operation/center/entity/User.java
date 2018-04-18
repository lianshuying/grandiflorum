package com.ulo.operation.center.entity;

import java.io.Serializable;

/**
 * 系统用户表
 */

public class User implements Serializable {

    private Long id;

    private String name;//真实名称

    private String passWord;

    private String userName;//用户名

    private String reputation; //名誉封号


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }
}

