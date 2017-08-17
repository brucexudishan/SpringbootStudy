package com.example.mapper;

import com.example.domain.User;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/6/17 21:59
 * @修改者:
 * @修改时间:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest extends TestCase {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testGetAll() throws Exception {
        List<User>userList= userMapper.getAll();
        for(User u:userList){
            System.out.println(u.toString());
        }

    }
    @Test
    public void testGetOne() throws Exception {

    }
    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new User("aa", "a123456", "man"));
        userMapper.insert(new User("bb", "b123456", "woman"));
        userMapper.insert(new User("cc", "c123456", "man"));
        Assert.assertEquals(3,userMapper.getAll().size());
    }

    public void testUpdate() throws Exception {

    }
    @Test
    public void testDelete() throws Exception {

    }
}