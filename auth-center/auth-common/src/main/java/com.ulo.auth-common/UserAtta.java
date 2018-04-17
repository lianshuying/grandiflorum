package com.ulo.auth.server.po;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户微信，Git,博客等信息资源
 */
@Entity
@Table(name="SYSTEM_USER_ATTA")
public class UserAtta  implements Serializable {

//    @Id
//    @GenericGenerator(name="idGenerator", strategy="uuid") //这个是hibernate的注解/生成32位UUID
//    @GeneratedValue(generator="idGenerator")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name=" userInfoId ")
    private Long userInfoId;

    @Column(name=" year ")
    private String year;

    @Column(name=" month ")
    private String month;

    @Column(name=" day ")
    private String day;

    @Column(name=" Email ")
    private String Email;

    @Column(name=" phone ")
    private String phone;

    @Column(name=" phone2 ")
    private String phone2;

    @Column(name=" address ")
    private String address;

    @Column(name=" vxId ")
    private String vxId;  //外键

    @Column(name=" gitUrl ")
    private String gitUrl; //git地址

    @Column(name=" blog ")
    private String  blog; //博客地址


    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVxId() {
        return vxId;
    }

    public void setVxId(String vxId) {
        this.vxId = vxId;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
