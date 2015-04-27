package com.jenwis.common.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jenwis.common.account.bean.Account;

@Controller  
public class AccountController {  
	
    @RequestMapping(value = "/person/profile/{id}/{name}/{status}", method = RequestMethod.GET)  
    public @ResponseBody  
    Account porfile(@PathVariable int id, @PathVariable String name,  @PathVariable boolean status) {  
        return new Account();  
    }  
  
    /** 
     * 登录 
     *  
     * @param account 
     * @return 
     */  
    @RequestMapping(value = "/account/login", method = RequestMethod.POST)  
    public @ResponseBody  
    Account login(@RequestBody Account account) {  
        return account;  
    }  
}  
