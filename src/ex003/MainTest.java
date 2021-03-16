package ex003;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
	// Failure message: 
	// This test has no failure messages
	Main a = new Main();
	assertEquals("TEST",a.makeCapital("test"));
	}
}
