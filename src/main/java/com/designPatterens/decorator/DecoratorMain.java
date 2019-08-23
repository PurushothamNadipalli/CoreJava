package com.designPatterens.decorator;

public class DecoratorMain {
	public static void main(String[] args) {
		Bank bank = new SampleDecorator(new Icici());
		bank.intrestRate();
	}
}
