import org.design.singleton.User;
import org.junit.Test;

public class SingletonTest {
	private static final int USER_NUM = 5;

	@Test
	public void testSingleton() {
		User[] users = new User[USER_NUM];
		for (int i = 0; i < USER_NUM; ++i) {
			users[i] = new User((i + 1) + "-user");
			users[i].print();
		}
	}

	@Test
	public void testNonSafeSingleton() throws InterruptedException {
		User[] users = new User[USER_NUM];
		for (int i = 0; i < USER_NUM; ++i) {
			users[i] = new User((i + 1) + "-user");
			users[i].nonThreadSafePrint();
		}

		Thread.sleep(100);
	}

	@Test
	public void testSafeSingleton() throws InterruptedException {
		User[] users = new User[USER_NUM];
		for (int i = 0; i < USER_NUM; ++i) {
			users[i] = new User((i + 1) + "-user");
			users[i].threadSafePrint();
		}

		Thread.sleep(100);
	}
}
