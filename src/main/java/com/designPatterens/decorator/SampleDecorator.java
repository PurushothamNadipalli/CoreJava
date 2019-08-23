package com.designPatterens.decorator;

public class SampleDecorator implements Bank {
	Bank bank;

	public SampleDecorator(Bank delegate) {
		this.bank = delegate;
	}

	@Override
	public void intrestRate() {
		bank.intrestRate();
		System.out.println("felling Awsome");
	}

}
