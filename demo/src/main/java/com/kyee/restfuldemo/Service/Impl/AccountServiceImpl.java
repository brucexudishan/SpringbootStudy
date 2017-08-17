package com.kyee.restfuldemo.Service.Impl;

import com.kyee.restfuldemo.Dao.db2.AccountDao;
import com.kyee.restfuldemo.Entity.db2.Account;
import com.kyee.restfuldemo.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mork on 2017/8/17.
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    private final AccountDao accountDao;

    @Autowired
    public AccountServiceImpl(AccountDao accountDao){
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.getAllAccount();
    }
}
