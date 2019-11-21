/**
 * 
 */
package exercises;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Jacek
 *
 */
class BeautifulDaysAtTheMoviesTest {

	/**
	 * Test method for {@link exercises.BeautifulDaysAtTheMovies#beautifulDays(int, int, int)}.
	 */
	@Test
	final void testBeautifulDays1() {
		assertEquals(2, BeautifulDaysAtTheMovies.beautifulDays(20, 23, 6), "Should return 2");
	}
	
	@Test
	final void testBeautifulDays2() {
		assertEquals(4, BeautifulDaysAtTheMovies.beautifulDays(15, 18, 3), "Should return 4");	
	}
	

}
