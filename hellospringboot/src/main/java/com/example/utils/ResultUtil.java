package com.example.utils;

import com.example.domain.Result;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/5/22 14:09
 * @修改者:
 * @修改时间:
 */
public class ResultUtil {
    public static Result succes(Object object){
        Result result=new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    public static  Result success(){
        return succes(null);
    }
    public static Result error(Integer code,String msg){
        Result result=new Result();
        result.setCode(1);
        result.setMsg(msg);
        return result;
    }
}
