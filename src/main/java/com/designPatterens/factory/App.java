package com.designPatterens.factory;

public interface App {
	public void print();

	public void show();

	public void view();

	public default void vision() {
		System.out.println("Vision");
	}

}
