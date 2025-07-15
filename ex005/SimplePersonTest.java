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
        SimplePerson other = new SimplePerson();
        other.active = false;
        other.name = "Alice";
        other.grade = 12;

        assertFalse(other.active);
        assertEquals("Alice", other.name);
        assertEquals(12, other.grade);
    }

    @Test
    public void testFieldsArePublic() throws Exception {
        Class<?> classObject = SimplePerson.class;

        try {
			Field activeField = classObject.getDeclaredField("active");
			assertEquals(true, Modifier.isPublic(activeField.getModifiers()));
		} catch (NoSuchFieldException e) {
			fail(e.toString());
		}

        try {
			Field nameField = classObject.getDeclaredField("name");
			assertEquals(true, Modifier.isPublic(nameField.getModifiers()));
		} catch (NoSuchFieldException e) {
			fail(e.toString());
		}	

        try {
			Field gradeField = classObject.getDeclaredField("grade");
			assertEquals(true, Modifier.isPublic(gradeField.getModifiers()));
		} catch (NoSuchFieldException e) {
			fail(e.toString());
		}
        
    }
}
