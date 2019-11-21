package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * @author Jacek
 *
 */
class CatsAndAMouseTest {

	@Nested
	@DisplayName("Testing catAndMouse method")
	class testCatAndMouse{
		/**
		 * Test method for {@link exercises.CatsAndAMouse#catAndMouse(int, int, int)}.
		 */
		@Test
		final void testCatAWins() {
			String expected = "Cat A";
			String actual = CatsAndAMouse.catAndMouse(1, 4, 2);
			assertEquals(expected, actual, "Cat A should get mouse first.");
		}
		
		@Test
		final void testCatBWins() {
			String expected = "Cat B";
			String actual = CatsAndAMouse.catAndMouse(1, 4, 3);
			assertEquals(expected, actual, "Cat B should get mouse first.");
		}
		
		@Test
		final void testMouseCWins() {
			String expected = "Mouse C";
			String actual = CatsAndAMouse.catAndMouse(1, 3, 2);
			assertEquals(expected, actual, "Mouse C should escape.");
		}
	}
	

	/**
	 * Test method for {@link exercises.CatsAndAMouse#main(java.lang.String[])}.
	 */
	@Test
	final void testMain() {
		fail("Not yet implemented"); // TODO
	}

}
