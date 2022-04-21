package com.perscholas.java_creating_a_monster;

public class Monster {
	
	private String name;
	
	
	public Monster(String name) {
		super();
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Monster [name=" + name + "]";
	}
	
	public String attack() {
		return "!^_&^$@+%$* I don't know how to attack!";
	}




}
