import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class StockTest {
	
	//v2025-1-26

	@Test
	public void test() {
		//arguments in represent tickerSymbol, companyName, price, and totalShares
		Stock stock = new Stock("abc","Alphabet",20.0,100);

		//test accessors
		assertEquals("ABC",stock.getTickerSymbol());
		assertEquals("Alphabet", stock.getCompanyName());
		assertEquals(20.00, stock.getPrice(), 0.001);
		assertEquals(100, stock.getTotalShares());		
		assertEquals(2000.0,stock.getMarketCap(), 0.001);

		//test toString
		assertEquals("ticker symbol: ABC; company: Alphabet; current price: $20.00;", stock.toString());

		
		//test adjustPrice; method should return the percentage that the price change represents, and should also
		//adjust (mutate) the price and therefore also the market capitalization
		assertEquals(-25.0,  stock.adjustPrice(-5.00), 0.001);
		assertEquals(15.00, stock.getPrice(), 0.001);
		assertEquals(1500.0,stock.getMarketCap(), 0.001);

		assertEquals(20.0, stock.adjustPrice(3.00),0.001);
		assertEquals(18.00, stock.getPrice(), 0.001);
		assertEquals(1800.0,stock.getMarketCap(), 0.001);
		
		stock.setShares(300);
		assertEquals(5400.0,stock.getMarketCap(), 0.001);
		assertEquals(18.00, stock.getPrice(), 0.001);
		
		//test if multiple instances can be created
		stock = new Stock("XYZ","Dimension",1.00,3);
		assertEquals("ticker symbol: XYZ; company: Dimension; current price: $1.00;", stock.toString());
		
		
	}
}
