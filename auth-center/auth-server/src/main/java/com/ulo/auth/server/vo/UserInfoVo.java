package com.ulo.auth.server.vo;

/**
 * 用户登录
 */
public class UserInfoVo {

    private String name;

    private String userName;

    private String Email;

    private String VX;

    private String Ali;

    private String phone;

    private String passWord;

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
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
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getVX() {
        return VX;
    }

    public void setVX(String VX) {
        this.VX = VX;
    }

    public String getAli() {
        return Ali;
    }

    public void setAli(String ali) {
        Ali = ali;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
