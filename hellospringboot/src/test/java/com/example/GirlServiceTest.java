package com.example;

import com.example.domain.Girl;
import com.example.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/6/17 11:09
 * @修改者:
 * @修改时间:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {
    @Autowired
    private GirlService girlService;
    @Test
    public void findOneTest(){
        Girl girl=girlService.findOne(16);
        Assert.assertEquals(new Integer(18),girl.getAge());
    }


}
