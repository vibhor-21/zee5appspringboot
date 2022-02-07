package com.zee.zee5app.service;

import java.nio.file.FileAlreadyExistsException;
import java.util.List;
import java.util.Optional;

import javax.naming.InvalidNameException;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.exception.AlreadyExistsException;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.exception.InvalidIdLengthException;

public interface UserService2 {
	public Register addUser(Register register) throws AlreadyExistsException;
	public String updateUser(String id, Register register);
	public Register getUserById(String id) throws IdNotFoundException;
	public Optional<List<Register>> getAllUsers();
	public String deleteUserById(String id) throws IdNotFoundException;
}
