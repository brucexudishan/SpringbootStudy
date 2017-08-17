package com.kyee.restfuldemo.Service.Impl;

import com.kyee.restfuldemo.Dao.db1.UserDemoDao;
import com.kyee.restfuldemo.Entity.db1.UserDemo;
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
        return userDemoDao.getOne(userId);
    }

    @Override
    public List<UserDemo> findAllUserDemo() {
        return userDemoDao.getAll();
    }

    @Override
    public void addUserDemo(UserDemo userDemo) {
        userDemoDao.insert(userDemo);
    }

    @Override
    public void updateUserDemo(UserDemo userDemo) {
        userDemoDao.update(userDemo);
    }

    @Override
    public void deleteUserDemo(UserDemo userDemo) {
        userDemoDao.delete(userDemo);
    }


}
