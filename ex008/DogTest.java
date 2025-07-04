import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class DogTest {

	@Test
	public void test() {
		// Failure message: 
		// This test has no failure messages
		Dog d1 = new Dog("Charlie","Laborador",60);
		assertEquals("Laborador",d1.breed);
		assertEquals("Charlie",d1.name);
		assertEquals(60,d1.weight);
		Dog d2 = new Dog("Doggo",30);
		assertEquals("mutt",d2.breed.toLowerCase());
		assertEquals("Doggo",d2.name);
		assertEquals(30,d2.weight);
	}
}
