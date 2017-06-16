package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/5/11 15:52
 * @修改者:
 * @修改时间:
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {
    @Value("${girl}")
    public String girl;
    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String say(@RequestParam(value = "id",required=false,defaultValue ="0") Integer id){
        return "id:"+id+"name:"+girl;
    }
}
