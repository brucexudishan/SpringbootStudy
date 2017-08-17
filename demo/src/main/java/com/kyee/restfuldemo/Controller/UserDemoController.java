package com.kyee.restfuldemo.Controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kyee.restfuldemo.Entity.db1.UserDemo;
import com.kyee.restfuldemo.Service.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
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
//    public HttpEntity getOne(@PathVariable("userId") Integer userId){
//        UserDemo userDemo = userDemoService.findUserDemoById(userId);
//        return new ResponseEntity(userDemo, HttpStatus.OK);
//    }
    //还可以使用?userId=xxx
    //用@RequestParam注解来取到

    //@GetMapping(value = "/{userId}")
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

    @RequestMapping(value = "/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public List<UserDemo> getPGAllUserDemo(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);

        List<UserDemo> userDemos = userDemoService.findAllUserDemo();

        //页码相关信息
//        PageInfo<UserDemo> pageInfo = new PageInfo<>(userDemos);

        return userDemos;
    }
    //@PostMapping(value = "/")
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
