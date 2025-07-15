import org.junit.*;
import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void testAllParametersConstructor() {
        Car c = new Car("Toyota", "Prius", 4, 120, 30000);
        assertEquals("Toyota", c.make);
        assertEquals("Prius", c.model);
        assertEquals(4, c.numberOfDoors);
        assertEquals(120, c.topSpeed);
        assertEquals(30000, c.price);
    }

    @Test
    public void testNoNumberOfDoorsConstructor() {
        Car c = new Car("Toyota", "Prius", 120, 30000);
        assertEquals("Toyota", c.make);
        assertEquals("Prius", c.model);
        assertEquals(4, c.numberOfDoors); // default
        assertEquals(120, c.topSpeed);
        assertEquals(30000, c.price);
    }

    @Test
    public void testNoMakeOrModelConstructor() {
        Car c = new Car(4, 120, 30000);
        assertEquals("unknown", c.make.toLowerCase());
        assertEquals("unknown", c.model.toLowerCase());
        assertEquals(4, c.numberOfDoors);
        assertEquals(120, c.topSpeed);
        assertEquals(30000, c.price);
    }

    @Test
    public void testNoTopSpeedOrPriceConstructor() {
        Car c = new Car("Toyota", "Prius", 4);
        assertEquals("Toyota", c.make);
        assertEquals("Prius", c.model);
        assertEquals(4, c.numberOfDoors);
        assertEquals(90, c.topSpeed); // default
        assertEquals(0, c.price);     // default
    }
}
