import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
	public void testAccessors() {

        Student student1 = new Student("Bloggins", "Billy", 123456);
    	assertEquals(student1.getLastName(), "Bloggins");
    	assertEquals(student1.getFirstName(), "Billy");
    	assertEquals(student1.getID(), 123456);
    
    	Student student2 = new Student("Doe","Jane", 654321);
    	assertEquals(student2.getLastName(), "Doe");
    	assertEquals(student2.getFirstName(), "Jane");
    	assertEquals(student2.getID(), 654321);
	}
}
