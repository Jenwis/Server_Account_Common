package com.jenwis.common.account.logic;

import com.jenwis.common.account.bean.Account;
import com.jenwis.common.account.bean.RegisterReturn;
import com.jenwis.common.account.config.Config;
import com.jenwis.common.account.util.AccountUtil;

/**
 * @author zhengyuji
 * 注册请求的逻辑判断，
 */
public class RegisterLogic {
	/*
	 * 判断账号
	 * */
	public RegisterReturn checkoutRegister(Account account) {
    	if (account == null) {
    		return null;
		}
    	
    	RegisterReturn registerReturn = new RegisterReturn();
    	registerReturn.setAccount(account.getAccount());
    	if (!AccountUtil.isMobileNO(account.getAccount())) {
    		registerReturn.setStateCode(Config.STATE_CODE_ACCOUNT_FORMAT_ERROR);
		} else if (AccountUtil.isPasswordLegal(account.getPassword())) {
			registerReturn.setStateCode(Config.STATE_CODE_PASSWOR_FORMAT_ERROR);
		}
    	
    	return registerReturn;
    }
}
