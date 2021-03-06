package com.perscholas.java_library_users;

public class KidUser implements LibraryUser{
	
	private int age;
	private String bookType;
	
	public KidUser() {
		
	}

	public KidUser(int age) {
		super();
		this.age = age;
	}

	public KidUser(String bookType) {
		super();
		this.bookType = bookType;
	}

	@Override
	public String toString() {
		return "KidUsersImpl [age=" + age + ", bookType=" + bookType + "]";
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
	public void registerAccount(int age) {
		if (age < 12) {
			System.out.println("You have successfully registered under a Kids Account");
		} else if (age > 12) {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}

	@Override
	public void requestBook(String bookType) {
		if (bookType == "Kids") {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}



	

}
