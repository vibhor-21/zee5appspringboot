package com.zee.zee5app.service;

import com.zee.zee5app.dto.EROLE;
import com.zee.zee5app.dto.Login;

public interface LoginService {

	public String addCredentials(Login login);
	public String deleteCredentials(String userName);
	public String changePassword(String userName,String password);
//	public String changeRole(String userName, EROLE role);
}
