import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class SimplePersonTest {

    @Test
	public void test() {
        
		SimplePerson person = new SimplePerson();

		assertEquals(person.active,true);
		assertEquals(person.name,"Nemo");
		assertEquals(person.grade,11);
	}

}
