package com.zee.zee5app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.repository.LoginRepository;
import com.zee.zee5app.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	
	@Autowired
	private LoginRepository loginRepo;
	
	@Override
	public String addCredentials(Login login) {
		// TODO Auto-generated method stub
		Login login2 = loginRepo.save(login);
		if(login2!=null)
			return "success";
		else
			return "fail";
	}

	@Override
	public String deleteCredentials(String userName) {
		// TODO Auto-generated method stub
		if(!this.loginRepo.existsById(userName))
			return "fail";
		this.loginRepo.deleteById(userName);
		return "success";
	}

	@Override
	public String changePassword(String userName, String password) {
		// TODO Auto-generated method stub
		if(!this.loginRepo.existsById(userName))
			return "fail";
		Optional<Login> login = this.loginRepo.findById(userName);
		login.get().setPassword(password);
		return (this.loginRepo.save(login.get())!=null)?"success":"fail";
	}

	



}
