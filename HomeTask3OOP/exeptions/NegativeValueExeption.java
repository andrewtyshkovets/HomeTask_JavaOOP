package com.gmail.tas.exeptions;

public class NegativeValueExeption extends Exception {
	
	private String exceptionMessage;
	
	

	public NegativeValueExeption(String exceptionMessage) {
		super();
		this.exceptionMessage = exceptionMessage;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	public NegativeValueExeption() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NegativeValueExeption [exceptionMessage=" + exceptionMessage + "]";
	}
	
	

}
