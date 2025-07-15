import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testConstructorWithAllParameters() {
        Dog d1 = new Dog("Charlie", "Labrador", 60);
        assertEquals("Charlie", d1.name);
        assertEquals("Labrador", d1.breed);
        assertEquals(60, d1.weight);
    }

    @Test
    public void testConstructorWithNameAndWeightDefaultsBreed() {
        Dog d2 = new Dog("Doggo", 30);
        assertEquals("Doggo", d2.name);
        assertEquals("Mutt", d2.breed); // Should be exactly "Mutt" as per instructions
        assertEquals(30, d2.weight);
    }
}
