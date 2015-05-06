package com.jenwis.common.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jenwis.common.account.bean.Account;
import com.jenwis.common.account.bean.RegisterReturn;
import com.jenwis.common.account.config.Config;
import com.jenwis.common.account.logic.RegisterLogic;

@Controller
@RequestMapping("/account")
public class AccountController {  
	private RegisterLogic registerLogic = new RegisterLogic();
    /** 
     * 登录 
     *  
     * @param account 
     * @return 
     */  
    @RequestMapping(value = "/login", method = RequestMethod.POST)  
    public @ResponseBody Account login(@RequestBody Account account) {
        return account;
    }
    
    /** 
     * 注册 
     *  
     * @param account 
     * @return 
     */  
    @RequestMapping(value = "/register", method = RequestMethod.POST)  
    public @ResponseBody RegisterReturn register(@RequestBody Account account) {
        return registerLogic.checkoutRegister(account);
    }
}  
