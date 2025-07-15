import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class PersonTest {


	@Test
	public void test() {

		Person person = new Person("Billy","Bob",10,25,1900);
		assertEquals("Billy",person.getFirstName());
		assertEquals("Bob",person.getLastName());
		person.setFirstName("John");
		person.setLastName("Doe");
		assertEquals("John",person.getFirstName());
		assertEquals("Doe",person.getLastName());
		assertEquals("10/25/1900",person.getBirthday());

		assertEquals(true,person.setBirthDay(17));
		assertEquals(true,person.setBirthMonth(3));
		assertEquals(true,person.setBirthYear(1997));
		assertEquals("3/17/1997",person.getBirthday());

		assertEquals(false, person.setBirthDay(32));
		assertEquals(false, person.setBirthDay(-1));
		assertEquals("3/17/1997",person.getBirthday());

		assertEquals(false, person.setBirthMonth(13));
		assertEquals(false, person.setBirthMonth(-1));
		assertEquals("3/17/1997",person.getBirthday());
	}	
}
