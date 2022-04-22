package com.perscholas.java_creating_a_monster;

public class CustomException extends Exception {
	
//	public CustomException() {
//	
//	}
	
	public CustomException(boolean isMonster) {
		super();
		System.out.println("custom exception");
		
	}

}
