package com.kyee.restfuldemo.Controller;

import com.kyee.restfuldemo.Entity.UserDemo;
import com.kyee.restfuldemo.Service.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mork on 2017/8/15.
 */

@RestController
@RequestMapping("/user")
public class UserDemoController {

    @Autowired
    private UserDemoService userDemoService;

//也可以这么写
//    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
//    public HttpEntity getUserDemoByUserId(@PathVariable("userId") Integer userId){
//        UserDemo userDemo = userDemoService.findUserDemoById(userId);
//        return new ResponseEntity(userDemo, HttpStatus.OK);
//    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public UserDemo getUserDemoByUserId(@PathVariable("userId") Integer userId){
        UserDemo userDemo = userDemoService.findUserDemoById(userId);
        return userDemo;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<UserDemo> getAllUserDemo(){
        List<UserDemo> userDemos = userDemoService.findAllUserDemo();
        return userDemos;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void addUser(@RequestBody UserDemo userDemo) {
        userDemoService.addUserDemo(userDemo);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public void updateUser(@RequestBody UserDemo userDemo){
        userDemoService.updateUserDemo(userDemo);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteUser(@RequestBody UserDemo userDemo){
        userDemoService.deleteUserDemo(userDemo);
    }


}
