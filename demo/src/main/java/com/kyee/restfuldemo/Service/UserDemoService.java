package com.kyee.restfuldemo.Service;

import com.kyee.restfuldemo.Entity.UserDemo;

import java.util.List;

/**
 * Created by mork on 2017/8/15.
 */
public interface UserDemoService {
    UserDemo findUserDemoById(int userId);
    List<UserDemo> findAllUserDemo();
    void addUserDemo(UserDemo userDemo);
    void updateUserDemo(UserDemo userDemo);
    void deleteUserDemo(UserDemo userDemo);



}
