package com.foodbucket.exception;

@SuppressWarnings("serial")
public class ConfirmPasswordNotMatchException extends RuntimeException{
	
	public ConfirmPasswordNotMatchException(String msg) {super (msg);}

}
