package com.kyee.restfuldemo.Dao.db1;

import com.kyee.restfuldemo.Entity.UserDemo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mork on 2017/8/15.
 */

@Repository
public interface UserDemoDao {

    UserDemo getOne(Integer userid);

    List<UserDemo> getAll();

    void insert(UserDemo userDemo);

    void update(UserDemo userDemo);

    void delete(UserDemo userDemo);

}
