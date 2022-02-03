package com.zee.zee5app.service.impl;

import java.util.List;
import java.util.Optional;

import javax.naming.InvalidNameException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.exception.InvalidIdLengthException;
import com.zee.zee5app.repository.UserRepository;
import com.zee.zee5app.service.UserService2;

@Service
public class UserServiceImpl implements UserService2 {

	@Autowired
	private UserRepository userRepository;
	
	
	
	@Override
	public String addUser(Register register) {
		// TODO Auto-generated method stub
		Register register2 = userRepository.save(register);
		
		if(register2!=null) {
			return "success";
		}
		else
			return "fail";
	}

	@Override
	public String updateUser(String id, Register register) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Register> getUserById(String id)
			throws IdNotFoundException, InvalidNameException, InvalidIdLengthException {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public Optional<List<Register>> getAllUsers() throws InvalidNameException, InvalidIdLengthException {
		// TODO Auto-generated method stub
		return Optional.ofNullable(userRepository.findAll());
	}

	@Override
	public String deleteUserById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
//		userRepository.deleteById(id);
		
		Optional<Register> optional;
		try {
			optional = this.getUserById(id);
			if(optional.isEmpty()) {
				throw new IdNotFoundException("record not found");
			}else {
				userRepository.deleteById(id);
				return "success";
			}
		} catch (InvalidNameException | IdNotFoundException | InvalidIdLengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IdNotFoundException(e.getMessage());
		}
	}

}
