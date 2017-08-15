package com.kyee.restfuldemo.Dao;

import com.kyee.restfuldemo.Entity.UserDemo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mork on 2017/8/15.
 */

@Repository
public interface UserDemoDao {
    @Select("select * from userdemo where userid = #{userid}")
    @ResultType(UserDemo.class)
    UserDemo getUserDemoByUserId(Integer userid);

    @Select("select * from userdemo")
    @ResultType(UserDemo.class)
    List<UserDemo> getAllUserDemo();

    @Insert("INSERT INTO userdemo(userid, username) VALUES(#{userDemo.userId},#{userDemo.userName})")
    void insertUserDemo(@Param("userDemo") UserDemo userDemo);

    @Update("update userdemo set username=#{userDemo.userName} where userid=#{userDemo.userId}")
    void updateUserDemo(@Param("userDemo") UserDemo userDemo);

    @Delete("delete from userdemo where userid=#{userDemo.userId}")
    void deleteUserDemo(@Param("userDemo") UserDemo userDemo);

}
