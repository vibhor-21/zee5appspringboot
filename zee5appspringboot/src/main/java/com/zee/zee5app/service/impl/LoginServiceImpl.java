package com.zee.zee5app.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.dto.ROLE;
import com.zee.zee5app.repository.LoginRepository;
import com.zee.zee5app.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepo;
	
	private LoginServiceImpl() throws IOException {
		
	}
	private static LoginService loginService = null;
	
	
	@Override
	public String addCredentials(Login login) {
		// TODO Auto-generated method stub
		return this.loginRepo.addCredentials(login);
	}

	@Override
	public String deleteCredentials(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changePassword(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String changeRole(String userName, ROLE role) {
		// TODO Auto-generated method stub
		return loginRepo.changeRole(userName, role);
	}

}
