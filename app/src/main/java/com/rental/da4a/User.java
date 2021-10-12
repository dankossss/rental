package com.rental.da4a;

public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private String city;
    private String phone;

    public User(String login, String password, String city) {
        this.email = login;
        this.password = password;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }
}
