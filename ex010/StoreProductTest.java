import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class StoreProductTest {

	@Test
	public void test() {
		StoreProduct product1 = new StoreProduct("Eggs",3.0,10);
		StoreProduct product2 = new StoreProduct("Paper Towels",2.0, 24);
		assertEquals(false,product2.getExpired());

		product1.setExpired(false);
		assertEquals(false, product1.getExpired());
		assertEquals(10,product1.stock);

		product1.setExpired(true);
		assertEquals(0,product1.stock);
		assertEquals(true, product1.getExpired());

		assertEquals(true,product2.makeSale(10));
		assertEquals(14,product2.stock);
		
		assertEquals(false,product2.makeSale(25));
		assertEquals(14,product2.stock);

		assertEquals(1.5,product1.getDiscountedPrice(0.5),0.001);
		assertEquals(3.0,product1.getDiscountedPrice(0),0.001);
		assertEquals(0.3,product1.getDiscountedPrice(0.9),0.001);
	}
}