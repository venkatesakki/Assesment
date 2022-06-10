package com.assesment;

public class UnKnownCardException extends Exception{
	String cardNo;
	public UnKnownCardException(String cardNo) {
		this.cardNo=cardNo;
	}
	public String show()
	{
		return "invalid cardNo :"+cardNo;
	}
	

}
