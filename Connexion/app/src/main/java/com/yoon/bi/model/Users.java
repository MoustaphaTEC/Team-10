package com.yoon.bi.model;

public class Users {
    private String pseudo, number, password;

    public Users (){

    }

    public Users(String pseudo, String number, String password) {
        this.pseudo = pseudo;
        this.number = number;
        this.password = password;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
