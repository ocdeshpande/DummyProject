package com.test.practice;

import java.io.Serializable;

public class MySingleton implements Serializable {

	private MySingleton() {

	}

	private static class InnerSingletonHelper {

		private static final MySingleton singletonInstance = new MySingleton();
	};

	public static MySingleton getInstance() {
		return InnerSingletonHelper.singletonInstance;
	}

	private Object readResolve() {
		return InnerSingletonHelper.singletonInstance;
	}
}
