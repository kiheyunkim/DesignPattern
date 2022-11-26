package com.kihyeonkim.pattern.singleton;

public class ThreadSafeSingletonInstance {
	private static ThreadSafeSingletonInstance singletonInstance = null;

	private ThreadSafeSingletonInstance() {
	}

	public synchronized static ThreadSafeSingletonInstance getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new ThreadSafeSingletonInstance();
		}

		return singletonInstance;
	}

	public String run() {
		return "I am Working!";
	}
}
