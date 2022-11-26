import com.kihyeonkim.pattern.composite.Computer;
import com.kihyeonkim.pattern.composite.Display;
import com.kihyeonkim.pattern.composite.HardDrive;
import com.kihyeonkim.pattern.composite.Mouse;
import com.kihyeonkim.pattern.singleton.SingletonInstance;
import com.kihyeonkim.pattern.singleton.ThreadSafeSingletonInstance;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DesignPatternTest {
	@Test
	public void testCompositePattern() {
		Computer computer = new Computer();

		computer.addDevice(new Display(100, 100));
		computer.addDevice(new HardDrive(20, 200));
		computer.addDevice(new Mouse(1, 2));

		assertEquals(302, computer.getTotalPower());
		assertEquals(121, computer.getTotalPrice());
	}

	@Test
	public void testSingletonPatternInOneThread() {
		SingletonInstance singletonInstance = SingletonInstance.getInstance();

		SingletonInstance singletonInstance2 = SingletonInstance.getInstance();

		assertSame(singletonInstance, singletonInstance2);
	}

	@Test
	public void testSingletonPatternInMultiThread() throws InterruptedException {
		List<String> instanceNameList = Collections.synchronizedList(new ArrayList<>());
		for (int i = 0; i < 100; ++i) {
			Thread thread = new Thread(() -> {
				SingletonInstance singletonInstance = SingletonInstance.getInstance();
				try {
					Thread.sleep(1);
					instanceNameList.add(singletonInstance.toString());
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			});

			thread.start();
		}

		Thread.sleep(1000);

		int count = (int) instanceNameList.stream().distinct().count();
		assertNotEquals(1, count);
	}

	@Test
	public void testThreadSafeSingletonPatternInMultiThread() throws InterruptedException {
		List<String> instanceNameList = Collections.synchronizedList(new ArrayList<>());

		for (int i = 0; i < 100; ++i) {
			Thread thread = new Thread(() -> {
				ThreadSafeSingletonInstance singletonInstance = ThreadSafeSingletonInstance.getInstance();
				try {
					Thread.sleep(1);
					instanceNameList.add(singletonInstance.toString());
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			});

			thread.start();
		}

		Thread.sleep(100);

		int count = (int) instanceNameList.stream().distinct().count();
		assertEquals(1, count);
	}
}
