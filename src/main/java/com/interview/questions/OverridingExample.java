package com.interview.questions;

public class OverridingExample {

	static Object o =null;
	static String s;
    int i=10;
	
	public void display(Object o) {
		System.out.println("Object");
	}
	public void display(String s) {
		System.out.println("String");
	}
	
	public static void main(String[] args) {
		try{
		OverridingExample ovr= new OverridingExample();
		ovr.display(o);
		}
		catch(Throwable s) {
			System.out.println(s);
		}
	}
}
