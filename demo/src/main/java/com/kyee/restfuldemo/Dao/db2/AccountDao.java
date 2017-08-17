package com.kyee.restfuldemo.Dao.db2;

import com.kyee.restfuldemo.Entity.db2.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mork on 2017/8/15.
 */

@Repository
public interface AccountDao {

    List<Account> getAllAccount();

}
