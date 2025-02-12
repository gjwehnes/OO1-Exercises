import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class BicycleTest {

	@Test
	public void testMutators() {

			Bicycle bicycle1 = new Bicycle(1,1, false, true);

			//test forwardGear
			assertEquals(bicycle1.getForwardGear(), 1);
			bicycle1.setForwardGear(2);
			assertEquals(bicycle1.getForwardGear(), 2);
			bicycle1.setForwardGear(3);
			assertEquals(bicycle1.getForwardGear(), 3);

			//test rearGear
			assertEquals(bicycle1.getRearGear(), 1);
			bicycle1.setRearGear(5);
			assertEquals(bicycle1.getRearGear(), 5);
			bicycle1.setRearGear(7);
			assertEquals(bicycle1.getRearGear(), 7);
			
			//test forwardBrake
			assertEquals(bicycle1.getForwardBrake(), false);
			bicycle1.setForwardBrake(true);
			assertEquals(bicycle1.getForwardBrake(), true);
			bicycle1.setForwardBrake(false);
			assertEquals(bicycle1.getForwardBrake(), false);

			//test rearBrake
			assertEquals(bicycle1.getRearBrake(), true);
			bicycle1.setRearBrake(true);
			assertEquals(bicycle1.getRearBrake(), true);
			bicycle1.setRearBrake(false);
			assertEquals(bicycle1.getRearBrake(), false);
	}
	}
