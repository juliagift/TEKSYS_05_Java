package com.perscholas.java_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;



@FunctionalInterface
interface AddMethod{
//	public void msg();
	public int add(int a, int b);
}

public class Main{

	public static void main(String[] args) {
		// String joiner
		
//		StringJoiner joinNames = new StringJoiner(",", "[", "]");
//		
//		//use add method from string joiner
//		joinNames.add("Julia");
//		joinNames.add("Sam");
//		joinNames.add("Bill");
//		joinNames.add("Sara");
//		
//		StringJoiner joinNames2 = new StringJoiner("-", "(", ")");
//		joinNames2.add("Joe");
//		joinNames2.add("John");
//		joinNames2.add("Dana");
//		
//		StringJoiner m = joinNames.merge(joinNames2);
//		
//		System.out.println(joinNames);
//		System.out.println(joinNames2);
//		System.out.println(m);
		
		
		
//		StringBuffer sb = new StringBuffer("Core Java");
//		sb.append("True");
//		sb.insert(3, "false");
//		sb.replace(1, 2, "av");
//		sb.delete(0, 4);
//		sb.reverse();
//		
//		System.out.println(sb);
		
//		String say = "Hello";
//		AddMethod me =()->{
//			System.out.println(say);
//		};
//		
//		me.msg();
		
		//lambda expression
//		//with the method code block
//		AddMethod addOne = (a,b) -> {
//			System.out.println(a+b);
//		};
//		addOne.add(35, 25);
		
		//make it one line
//		AddMethod addOne = (a,b)->(a+b);
//		System.out.println(addOne.add(10, 40));
		
		
//		List<String> listOne = new ArrayList<>();
//		listOne.add("Julia");
//		listOne.add("Sam");
//		listOne.add("Bill");
//		listOne.add("Sara");
//		
//		listOne.forEach((n)->System.out.println(n));
		
//		RunnableMyDemo runOne = new RunnableMyDemo("Thread-1");
//		runOne.start();
//		
//		RunnableMyDemo runTwo = new RunnableMyDemo("Thread-2");
//		runTwo.start();
		
		Sender send = new Sender();
		SendingThread sendOne = new SendingThread("Thread 1 sending", send);
		SendingThread sendTwo = new SendingThread("Thread 2 sending", send);
		
		sendOne.run();
		sendTwo.run();

	}

	

//	@Override
//	public void msg() {
//		System.out.println("Hello");
//		
//	}

}
