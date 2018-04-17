package com.ulo.auth.server.po;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 系统用户表
 */
@Entity
@Table(name="SYSTEM_USER")
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="name")
    private String name;//真实名称

    @Column(name="password")
    private String password;

    @Column(name=" user_name ")
    private String userName;//用户名

    @Column(name=" reputation ")
    private String reputation; //名誉封号


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

