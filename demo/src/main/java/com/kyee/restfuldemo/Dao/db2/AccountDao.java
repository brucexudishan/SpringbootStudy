package com.kyee.restfuldemo.Dao.db2;

import com.kyee.restfuldemo.Entity.Account;
import com.kyee.restfuldemo.Entity.UserDemo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mork on 2017/8/15.
 */

@Repository
public interface AccountDao {



    List<Account> getAllAccount();
;

}
