package net.samitlearning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
	@Test
	public void appTest() {
		assertEquals("HEllo", new App().msg("Hello"));
	}
	
}
