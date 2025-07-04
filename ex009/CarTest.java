import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class CarTest {

	@Test
	public void test() {
		Car c1 = new Car("Toyota","Prius",4,120,30000);
		Car c2 = new Car("Toyota","Prius",120,30000);
		assertEquals(4,c1.numberOfDoors);
		assertEquals(c1.numberOfDoors,c2.numberOfDoors);
		Car c3 = new Car(4,120,30000);
		assertEquals("unknown",c3.make.toLowerCase());
		assertEquals("unknown",c3.model.toLowerCase());
		Car c4 = new Car("Toyota","Prius",4);
		assertEquals(90,c4.topSpeed);
		assertEquals(0,c4.price);
	}
}
