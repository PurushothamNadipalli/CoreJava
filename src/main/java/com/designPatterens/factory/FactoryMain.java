package com.designPatterens.factory;

public class FactoryMain {
	public static void main(String[] args) {
		App app = AppFactory.createApp(AppType.Android);
		System.out.println(app);
		app.vision();
	}
}
