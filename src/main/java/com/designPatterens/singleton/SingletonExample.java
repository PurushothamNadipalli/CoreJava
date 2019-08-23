package com.designPatterens.singleton;

public class SingletonExample {
	static SingletonExample example = null;

	private SingletonExample() {

	}

	synchronized static SingletonExample getInstance() {

		if (example == null) {

			example = new SingletonExample();
		} else {
			return example;
		}

		return example;

	}

	public void print() {
		System.out.println("Singleton patteren example");
	}

	public static void main(String[] args) {
		SingletonExample.getInstance().print();
	}
}
