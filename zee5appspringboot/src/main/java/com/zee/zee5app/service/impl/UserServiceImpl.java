package com.zee.zee5app.service.impl;

import java.util.List;
import java.util.Optional;

import javax.naming.InvalidNameException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.EROLE;
import com.zee.zee5app.dto.Login;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.exception.AlreadyExistsException;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.exception.InvalidIdLengthException;
import com.zee.zee5app.repository.LoginRepository;
import com.zee.zee5app.repository.UserRepository;
import com.zee.zee5app.service.LoginService;
import com.zee.zee5app.service.UserService2;

@Service
public class UserServiceImpl implements UserService2 {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private LoginRepository loginRepsitory;
	
	@org.springframework.transaction.annotation.Transactional(rollbackFor = AlreadyExistsException.class)
	
	@Override
	public Register addUser(Register register) throws AlreadyExistsException {
		// TODO Auto-generated method stub
		
		if(userRepository.existsByEmailAndContactNumber(register.getEmail(), register.getContactNumber())==true) {
			throw new AlreadyExistsException("this record already exists");
		}
		
		Register register2 = userRepository.save(register);
		
		if(register2!=null) {
			Login login2 = new Login(register2.getEmail(), register2.getPassword(), register2);
//			Login login2 = new Login(register2.getEmail(),register2.getPassword(),register2.getId());
			if(loginRepsitory.existsByUserName(register2.getEmail())) {
				throw new AlreadyExistsException("record exits");
			}
			String res = loginService.addCredentials(login2);
			if(res.equals("success"))
				return register2;
			else
				return null;
		}
		else
			return null;
	}

	@Override
	public String updateUser(String id, Register register) {
		// TODO Auto-generated method stub
		if(this.userRepository.existsById(id)==false)
			return "fail";
		return (this.userRepository.save(register)!=null)?"success":"fail";
	}

	@Override
	public Register getUserById(String id)
			throws IdNotFoundException {
		// TODO Auto-generated method stub
		Optional<Register> optional = userRepository.findById(id);
		if(optional.isEmpty()) {
			throw new IdNotFoundException("id not found");
		}
		else
			return optional.get();
	}

	@Override
	public Optional<List<Register>> getAllUsers() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(userRepository.findAll());
	}

	@Override
	public String deleteUserById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
//		userRepository.deleteById(id);
		
		Register optional;
		try {
			optional = this.getUserById(id);
			if(optional==null) {
				throw new IdNotFoundException("record not found");
			}else {
				userRepository.deleteById(id);
				return "success";
			}
		} catch (IdNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IdNotFoundException(e.getMessage());
		}
	}

}
