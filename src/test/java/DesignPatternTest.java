import com.kihyeonkim.pattern.composite.Computer;
import com.kihyeonkim.pattern.composite.Display;
import com.kihyeonkim.pattern.composite.HardDrive;
import com.kihyeonkim.pattern.composite.Mouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
