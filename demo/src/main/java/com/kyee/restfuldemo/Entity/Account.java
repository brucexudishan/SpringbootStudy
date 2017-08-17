package com.kyee.restfuldemo.Entity;

/**
 * Created by mork on 2017/8/17.
 */
public class Account {
    private int id;
    private String userName;
    private int money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
