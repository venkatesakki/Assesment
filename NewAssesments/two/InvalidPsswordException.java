package com.assesment;

public class InvalidPsswordException extends Exception{
	String pin;
	public InvalidPsswordException(String pin) {
		this.pin=pin;
	}
	public String show()
	{
		return "invalid pin :"+pin;
	}

}
