import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class StoreProductTest {

	@Test
	public void test() {
		StoreProduct s1 = new StoreProduct("Eggs",3.0,10);
		StoreProduct s2 = new StoreProduct("Paper Towels",2.0, 24);
		assertEquals(false,s2.getExpired());

		s1.setExpired(false);
		assertEquals(s1.getExpired(), false);
		assertEquals(10,s1.stock);
		s1.setExpired(true);
		assertEquals(0,s1.stock);
		assertEquals(s1.getExpired(), true);

		assertEquals(true,s2.makeSale(10));
		assertEquals(14,s2.stock);
		assertEquals(false,s2.makeSale(25));
		assertEquals(14,s2.stock);

		assertEquals(1.5,s1.getDiscountedPrice(0.5),0.001);
		assertEquals(3.0,s1.getDiscountedPrice(0),0.001);
		assertEquals(0.3,s1.getDiscountedPrice(0.9),0.001);
	}
}