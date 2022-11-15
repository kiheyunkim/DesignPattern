package org.design.singleton;

public class NonThreadSafePrinter {
	private static NonThreadSafePrinter printer = null;

	private NonThreadSafePrinter() {
	}

	public static NonThreadSafePrinter getPrinter() {
		if (printer == null) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException interruptedException) {

			}
			printer = new NonThreadSafePrinter();
		}

		return printer;
	}

	public void print(String content) {
		System.out.println(content);
	}
}
