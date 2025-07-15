import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

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
    
    @Test
    public void testFieldsArePublic() throws Exception {
        Class<?> classObject = Student.class;

        try {
			Field activeField = classObject.getDeclaredField("studentLastName");
			assertEquals(true, Modifier.isPrivate(activeField.getModifiers()));
		} catch (NoSuchFieldException e) {
			fail(e.toString());
		}

        try {
			Field nameField = classObject.getDeclaredField("studentFirstName");
			assertEquals(true, Modifier.isPrivate(nameField.getModifiers()));
		} catch (NoSuchFieldException e) {
			fail(e.toString());
		}	

        try {
			Field gradeField = classObject.getDeclaredField("studentIdentification");
			assertEquals(true, Modifier.isPrivate(gradeField.getModifiers()));
		} catch (NoSuchFieldException e) {
			fail(e.toString());
		}
        
    }
    
}