package com.designPatterens.factory;

public class AppFactory {
	public static  App createApp(AppType type) {
		App app;
		switch (type) {
		case ios:
			app = new IosApp();
			break;
		case Android:
			app = new AndroidApp();
			break;

		default:
			app = new AndroidApp();
			break;
		}
		return app;
	}
}
