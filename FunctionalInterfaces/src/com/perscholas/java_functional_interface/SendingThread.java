package com.perscholas.java_functional_interface;

public class SendingThread extends Thread {

	private String message;
	Sender sender;

	public SendingThread(String msg, Sender send) {
		this.message = msg;
		this.sender = send;
	}

	public void run() {
		synchronized (sender) {
			sender.send(message);
		}
	}

}
