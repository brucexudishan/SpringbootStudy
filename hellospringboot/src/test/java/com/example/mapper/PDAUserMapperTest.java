package com.example.mapper;

import com.example.domain.PDAUser;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/7/31 21:30
 * @修改者:
 * @修改时间:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PDAUserMapperTest extends TestCase {

    @Autowired
    PDAUserMapper pdamapper;
    @Test
    public void testGetAllPDAUser() throws Exception {
        List<PDAUser> userList=pdamapper.getAllPDAUser();
        System.out.println(userList.toString());
    }

    public void testGetOne() throws Exception {

    }
}