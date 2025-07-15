import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;

public class SimplePersonTest {

    @Test
    public void testDefaultValues() {
        SimplePerson person = new SimplePerson();
        assertTrue(person.active);
        assertEquals("Nemo", person.name);
        assertEquals(11, person.grade);
    }

    @Test
    public void testFieldModification() {
        SimplePerson person = new SimplePerson();
        person.active = false;
        person.name = "Alice";
        person.grade = 12;

        assertFalse(person.active);
        assertEquals("Alice", person.name);
        assertEquals(12, person.grade);
    }

    @Test
    public void testFieldsArePublic() throws Exception {
        Class<?> classObject = SimplePerson.class;

        try {
			Field activeField = classObject.getField("active");
			assertEquals(true, Modifier.isPublic(activeField.getModifiers()));
		} catch (NoSuchFieldException e) {
			fail(e.toString());
		}

        try {
			Field nameField = classObject.getField("name");
			assertEquals(true, Modifier.isPublic(nameField.getModifiers()));
		} catch (NoSuchFieldException e) {
			fail(e.toString());
		}	

        try {
			Field gradeField = classObject.getField("grade");
			assertEquals(true, Modifier.isPublic(gradeField.getModifiers()));
		} catch (NoSuchFieldException e) {
			fail(e.toString());
		}
        
    }
}
