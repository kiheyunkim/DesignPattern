package org.design.singleton;

public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public void print() {
		SingletonPrinter printer = SingletonPrinter.getPrinter();
		printer.print(this.name + " print using " + printer.toString() + ".");
	}

	public void nonThreadSafePrint() {
		Thread thread = new Thread(() -> {
			NonThreadSafePrinter printer = NonThreadSafePrinter.getPrinter();
			printer.print(name + " print using " + printer.toString() + ".");
		});

		thread.start();
	}

	public void threadSafePrint() {
		Thread thread = new Thread(() -> {
			ThreadSafePrinter printer = ThreadSafePrinter.getPrinter();
			printer.print(name + " print using " + printer.toString() + ".");
		});

		thread.start();
	}
}
