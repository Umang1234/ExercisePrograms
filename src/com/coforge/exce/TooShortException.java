package com.coforge.exce;

public class TooShortException extends Exception {
	
	public TooShortException() {
		super();
	}
	public TooShortException(String message) {
		super(message);
	}
}
