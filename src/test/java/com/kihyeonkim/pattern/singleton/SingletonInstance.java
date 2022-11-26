package com.kihyeonkim.pattern.singleton;

public class SingletonInstance {
	private static SingletonInstance singletonInstance = null;

	private SingletonInstance() {
	}

	public static SingletonInstance getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new SingletonInstance();
		}

		return singletonInstance;
	}

	public String run() {
		return "I am Working!";
	}
}
