package com.example.domain;

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;

/**
 * @描述:Http请求返回的最外层对象
 * @创建者:许记山
 * @创建时间:2017/5/16 15:10
 * @修改者:
 * @修改时间:
 */
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    /**错误码**/
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**提示信息**/
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**具体内容**/
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
