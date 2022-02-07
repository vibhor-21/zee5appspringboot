package com.zee.zee5app.controlleradvice;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.zee.zee5app.exception.AlreadyExistsException;
import com.zee.zee5app.exception.IdNotFoundException;

@ControllerAdvice
public class ExceptionAdvice {

	//this class should be used when any userDefine exception is called
	//through out all the controller
	
	@ExceptionHandler(AlreadyExistsException.class)
	public ResponseEntity<?> alreadyRecordExistsExceptionHandler(AlreadyExistsException e) {
		
		HashMap<String,String> map = new HashMap<>();
		map.put("message", "records not found "+e.getMessage());
		return ResponseEntity.badRequest().body(map);
	}
	
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<?> exceptionHandler(Exception e) {
//		
//		HashMap<String,String> map = new HashMap<>();
//		map.put("message", "records not found "+e.getMessage());
//		return ResponseEntity.badRequest().body(map);
//	}
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<?> exceptionHandler(IdNotFoundException e){
		HashMap<String,String> map = new HashMap<>();
		map.put("message", "records not found "+e.getMessage());
		return ResponseEntity.badRequest().body(map);
	}
}
