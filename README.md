# Design Pattern

## Singleton

**정의: 인스턴스가 오직 하나만 생성되는 것을 보장하고 어디서든 이 인스턴스에 접근 할 수 있음**

SingletonPrinter 클래스는 싱글톤 구현의 기본형태를 보여줌

NonThreadSafePrinter 클래스는 SingletonPrinter가 여러 Thread에서 접근하는 경우 생기는 문제를 보여줌

ThreadSafePrinter 클래스는 여러 Thread에서 접근해도 안전하게 작성함을 보여줌

_싱글톤 패턴과 정적 클래스의 차이_

```java
public class Printer {
	private static int counter = 0;

	public synchronized static void print(String str) {
		count++;
		System.out.println(str + counter);
	}
}
```

정적클래스를 이용하게 되면 인터페이스를 구현해야하는 경우에 문제가 생김. -> static 메소드는 인터페이스에서 사용 불가능함
또한 인터페이스는 테스트 시에 필요함. 따라서 다음의 형태로 가져가게 됨

```java

public class UserPrinter {
	public void doSomething(Printer printer) {
		printer.print("print");
	}
}

public interface Printer {
	void print(String str);
}

public class RealPrinter implements Printer {   //실제 구현된 코드
	private static Printer printer = null;

	private RealPrinter() {
	}

	public synchronized static Printer getPrinter() {
		if (printer == null) {
			printer = new RealPrinter();
		}

		return printer;
	}

	public void print() {
		//print code
	}
}

public class FakePrinter implements Printer {   //테스트용 가짜
	private String str;

	public void print(String str) {
		this.str = str;
	}

	public String get() {
		return str;
	}
}
```

정적 Setter를 사용해서 테스트용 클래스를 만들 수도 있음

```java
public class UserPrinter {
	public void doSomething() {
		PrinterFactory.getPrinterFactory().getPrinter().print("test");
	}
}

public class PrinterFactory {
	private static PrinterFactory printerFactory = null;

	protected PrinterFactory() {
	}

	public synchronized static PrinterFactory getPrinterFactory() {
		if (printerFactory == null) {
			printerFactory = new PrinterFactory();
		}

		return printerFactory;
	}

	public static void setPrinterFactory(PrinterFactory p) {
		printerFactory = p;
	}

	public Printer getPrinter() {
		//return new Printer(); 구현체..
	}
}

public class FakePrinterFactory extends PrinterFactory {
	public Printer getPrinter() {
		return new FakePrinter();
	}
}
```
