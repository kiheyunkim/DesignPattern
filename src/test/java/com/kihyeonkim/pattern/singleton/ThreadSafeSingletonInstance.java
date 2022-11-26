package com.kihyeonkim.pattern.singleton;

public class ThreadSafeSingletonInstance {
	//static을 직접 field 초기화 하거나
	//static block을 통한 static 초기화를 통해서도 동기화 처리를 할 수 있음.
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
