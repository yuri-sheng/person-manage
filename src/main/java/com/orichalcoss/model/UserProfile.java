package com.orichalcoss.model;

public class UserProfile {
    private int id;
    private String mobile;
    private String password;
    private String eamil;

    public UserProfile() {
    }

    public UserProfile(int id, String mobile, String password, String eamil) {
        this.id = id;
        this.mobile = mobile;
        this.password = password;
        this.eamil = eamil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", eamil='" + eamil + '\'' +
                '}';
    }
}
