package com.kyee.restfuldemo.Controller;

import com.kyee.restfuldemo.Entity.db2.Account;
import com.kyee.restfuldemo.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mork on 2017/8/17.
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/")
    public List<Account> getAllAccounts(){
        return accountService.findAllAccount();

    }

}
