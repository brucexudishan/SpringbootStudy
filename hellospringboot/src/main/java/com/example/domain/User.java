package com.example.domain;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/6/17 17:29
 * @修改者:
 * @修改时间:
 */
public class User {
    private long id;
    private String userName;
    private String passWord;
    private String userSex;
    private String nickName;

    public User(){
        super();
    }
    public User(String userName,String passWord,String userSex){
        super();
        this.userName=userName;
        this.passWord=passWord;
        this.userSex=userSex;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
