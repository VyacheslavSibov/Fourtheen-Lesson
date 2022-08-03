package ua.ithillel.java;

import static ua.ithillel.java.Function.*;
public class User {
    //alt + ctrl + L
    private String login;
    private String password;
    private String name;
    private Function role = ANONYM;

    public User(String login, String password, String name, Function role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Function getRole() {
        return role;
    }

    public void setRole(Function role) {
        this.role = role;
    }
}