package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.bean.LoginBean;

@Service
public class LoginService {
	
	public String validateUser(LoginBean loginBean) {
		String userName = loginBean.getUserName();
		String password = loginBean.getPassword();
		if (userName.equals("test") && password.equals("password")) {
			return "true";
		} else {
			return "false";
		}
	}
}
