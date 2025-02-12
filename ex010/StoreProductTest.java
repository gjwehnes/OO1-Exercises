import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class StoreProductTest {

	@Test
	public void test() {
		StoreProduct product1 = new StoreProduct("Eggs",3.0,10);
		StoreProduct product2 = new StoreProduct("Paper Towels",2.0, 24);

		assertEquals("Eggs",product1.getLabel());
		assertEquals(3.0,product1.getPrice(),0);
		assertEquals(10,product1.getStock());
		assertEquals(false,product1.getExpired());
		
		assertEquals("Paper Towels",product2.getLabel());
		assertEquals(2.0,product2.getPrice(),0);
		assertEquals(24,product2.getStock());
		assertEquals(false,product2.getExpired());
		
		product1.setExpired(false);
		assertEquals(false, product1.getExpired());
		assertEquals(10,product1.stock);

		product1.setExpired(true);
		assertEquals(0,product1.getStock());
		assertEquals(true, product1.getExpired());

		assertEquals(true,product2.makeSale(10));
		assertEquals(14,product2.getStock());
		
		assertEquals(false,product2.makeSale(25));
		assertEquals(14,product2.getStock());

		assertEquals(1.5,product1.getDiscountedPrice(0.5),0.001);
		assertEquals(3.0,product1.getDiscountedPrice(0),0.001);
		assertEquals(0.3,product1.getDiscountedPrice(0.9),0.001);
	}
}