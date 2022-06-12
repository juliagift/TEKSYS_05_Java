package com.example.testfileupload.storageexceptions;

public class StorageNotFoundException extends StorageException{

	public StorageNotFoundException(String message) {
		super(message);
	}
	
	public StorageNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
