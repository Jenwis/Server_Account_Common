package com.jenwis.common.account.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountUtil {
	// 判断email格式是否正确
	public static boolean isEmail(String email) {
		String str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(email);

		return m.matches();
	}

	// 判断手机格式是否正确
	public static boolean isMobileNO(String mobiles) {
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
		Matcher m = p.matcher(mobiles);

		return m.matches();
	}

	//判断密码是否符合规定
	public static boolean isPasswordLegal(String password) {
		if (password == null)
			return false;
		if (password.length() < 4 || password.length() > 12) {
			return false;
		}

		return true;
	}
}
