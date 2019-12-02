package com.orichalcoss.model;

public class User {
    private int id;
    private String nickName;
    private String mobile;
    private String password;
    private String email;
    private String age;
    private String sex;
    private String birthday;

    public User() {
    }

    public User(int id, String nickName, String mobile, String password, String email, String age, String sex, String birthday) {
        this.id = id;
        this.nickName = nickName;
        this.mobile = mobile;
        this.password = password;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    @Override
    public String toString(){
        return "user={" + "id=" + id +
        "nickName" + nickName + "mobile" + mobile +
        "password" + password + "email" + email +
        "age" + age + "sex" + sex +
        "birthday" + birthday + "}";
    }
}
