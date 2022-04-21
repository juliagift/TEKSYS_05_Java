package com.perscholas.java_library_users;

public class AdultUser implements LibraryUser{
	
	private int age;
	private String bookType;
	
	public AdultUser() {
	}
	

	public AdultUser(int age) {
		super();
		this.age = age;
	}
	

	public AdultUser(String bookType) {
		super();
		this.bookType = bookType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public String toString() {
		return "AdultUser [age=" + age + ", bookType=" + bookType + "]";
	}

	@Override
	public void registerAccount(int age) {
		if (age > 12) {
			System.out.println("You have successfully registered under a Adult Account");
		} else if (this.age < 12) {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
	}

	@Override
	public void requestBook(String bookType) {
		if (bookType == "Fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops, you are allowed to take only Fiction books");
		}
		
	}
	
	
	
	

}
