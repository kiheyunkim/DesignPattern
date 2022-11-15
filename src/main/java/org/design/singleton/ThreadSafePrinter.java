package org.design.singleton;

public class ThreadSafePrinter {
	private static ThreadSafePrinter printer = null;		//또는 여기서 아예 초기화를 하고 이용하는 방법도 있음

	private ThreadSafePrinter() {
	}

	public synchronized static ThreadSafePrinter getPrinter() {
		if (printer == null) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException interruptedException) {

			}
			printer = new ThreadSafePrinter();
		}

		return printer;
	}

	public void print(String content) {
		System.out.println(content);
	}
}
