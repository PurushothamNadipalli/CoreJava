package com.interview.questions;

public class ExampleForSysout extends OverridingExample {
 
	int i=20;
	public static void display() {
		System.out.println("Hi");
	}
	
	public void display(String s) {
		System.out.println("String 1");
	}
	public static void main(String[] args) {
		OverridingExample ovr= new ExampleForSysout();
	    ovr.display("ss");
	    System.out.println(ovr.i);
	}
}
