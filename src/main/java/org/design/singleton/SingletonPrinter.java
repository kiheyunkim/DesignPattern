package org.design.singleton;

public class SingletonPrinter {
	private static SingletonPrinter printer = null;

	private SingletonPrinter() {
	}

	public static SingletonPrinter getPrinter() {
		if (printer == null) {
			printer = new SingletonPrinter();
		}

		return printer;
	}

	public void print(String content) {
		System.out.println(content);
	}
}
