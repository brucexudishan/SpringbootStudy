package com.example.domain;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/7/31 21:13
 * @修改者:
 * @修改时间:
 */
public class PDAUser {
    private long user_ID;
    private String user_Name;
    private String user_Pass_Word;
    private String remark;

    public long getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(long user_ID) {
        this.user_ID = user_ID;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Pass_Word() {
        return user_Pass_Word;
    }

    public void setUser_Pass_Word(String user_Pass_Word) {
        this.user_Pass_Word = user_Pass_Word;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
