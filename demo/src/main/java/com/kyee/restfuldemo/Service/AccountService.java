package com.kyee.restfuldemo.Service;

import com.kyee.restfuldemo.Entity.db2.Account;

import java.util.List;

/**
 * Created by mork on 2017/8/17.
 */
public interface AccountService {
    List<Account> findAllAccount();
}