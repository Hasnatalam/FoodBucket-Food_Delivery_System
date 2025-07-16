package com.foodbucket.exception;

public class ConfirmPasswordNotMatchException extends RuntimeException{
	
	public ConfirmPasswordNotMatchException(String msg) {
		super (msg);
	}

}
