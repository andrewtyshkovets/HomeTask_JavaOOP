package com.gmail.tas.exeptions;

public class OutOfRangeException extends Exception {
	
	private String exceptionMessage;

	public OutOfRangeException(String exceptionMessage) {
		super();
		this.exceptionMessage = exceptionMessage;
	}

	public OutOfRangeException() {
		// TODO Auto-generated constructor stub
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	@Override
	public String toString() {
		return "OutOfRangeException [exceptionMessage=" + exceptionMessage + "]";
	}

}
