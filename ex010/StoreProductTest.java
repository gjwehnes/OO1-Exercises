import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class StoreProductTest {

	@Test
	public void testConstructorsAccessors() {

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
	}
	
	
	@Test
	public void testSetExpired() {
		
		StoreProduct product = new StoreProduct("Eggs",3.0,10);

		product.setExpired(false);
		assertEquals(false, product.getExpired());
		assertEquals(10,product.getStock());
		
		product.setExpired(true);
		assertEquals(0,product.getStock());
		assertEquals(true, product.getExpired());

		product.setExpired(false);
		assertEquals(false, product.getExpired());
		assertEquals(10,product.getStock());
		
		
	}
	
	public void testGetDiscountedPrice() {

		StoreProduct product = new StoreProduct("Eggs",3.0,10);

		product.discountPrice(0.5);
		assertEquals(1.5, product.getPrice(),0.001);

		product.discountPrice(0.1);
		assertEquals(1.35, product.getPrice(),0.001);

		product.discountPrice(0);
		assertEquals(1.35, product.getPrice(),0.001);
		
	}
	
	public void testMakeSale() {

		StoreProduct product = new StoreProduct("Paper Towels",2.0, 24);
		
		assertEquals(true,product.makeSale(10));
		assertEquals(14,product.getStock());
		
		assertEquals(false,product.makeSale(25));
		assertEquals(14,product.getStock());
		
	}
}