package com.jenwis.common.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jenwis.common.account.bean.Account;

@Controller
@RequestMapping("/account")
public class AccountController {  
	
	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody Account getShopInJSON(@PathVariable String name) {
 
		Account account = new Account();
		account.setAccount(name);
		account.setStatusCode(1);
		return account;
 
	}

	
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
    @RequestMapping(value = "/login", method = RequestMethod.POST)  
    public @ResponseBody Account login(@RequestBody Account account) {  
        return account;  
    }  
}  
