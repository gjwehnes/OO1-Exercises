import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class InchWormTest {

	@Test
	public void test() {

        InchWorm worm1 = new InchWorm();
		assertEquals(0, worm1.getPosition());
		assertEquals(1, worm1.getDirection());
		worm1.move();
		worm1.move();
		worm1.turn();
		worm1.move();
		assertEquals(1, worm1.getPosition());
		assertEquals(-1, worm1.getDirection());

		InchWorm worm2 = new InchWorm(10);
		assertEquals(1, worm2.getDirection());
		worm2.move();
		worm2.move();
		worm2.move();
		worm2.move();
		worm2.turn();
		assertEquals(14, worm2.getPosition());
		assertEquals(-1, worm2.getDirection());
		worm2.move();
		worm2.move();
		worm2.turn();
		worm2.move();
		assertEquals(13, worm2.getPosition());
		assertEquals(1, worm2.getDirection());

        //ensure that instance variables were used... worm1 should still be in same state
		assertEquals(1, worm1.getPosition());
		assertEquals(-1, worm1.getDirection());
        
	}
}
