package com.kyee.restfuldemo.Service.Impl;

import com.kyee.restfuldemo.Dao.UserDemoDao;
import com.kyee.restfuldemo.Entity.UserDemo;
import com.kyee.restfuldemo.Service.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mork on 2017/8/15.
 */

@Service("userDemoService")
public class UserDemoServiceImpl implements UserDemoService{


    private final UserDemoDao userDemoDao;

    @Autowired
    public UserDemoServiceImpl(UserDemoDao userDemoDao){
        this.userDemoDao = userDemoDao;
    }

    @Override
    public UserDemo findUserDemoById(int userId) {
        return userDemoDao.getUserDemoByUserId(userId);
    }

    @Override
    public List<UserDemo> findAllUserDemo() {
        return userDemoDao.getAllUserDemo();
    }

    @Override
    public void addUserDemo(UserDemo userDemo) {
        userDemoDao.insertUserDemo(userDemo);

    }

    @Override
    public void updateUserDemo(UserDemo userDemo) {
        userDemoDao.updateUserDemo(userDemo);

    }

    @Override
    public void deleteUserDemo(UserDemo userDemo) {
        userDemoDao.deleteUserDemo(userDemo);
    }


}
