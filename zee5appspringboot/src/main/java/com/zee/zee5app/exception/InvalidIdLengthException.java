package com.zee.zee5app.exception;

import lombok.ToString;

@ToString(callSuper = true)
public class InvalidIdLengthException extends Exception {
	public InvalidIdLengthException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}
