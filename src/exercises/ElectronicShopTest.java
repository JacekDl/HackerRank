package exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.InputMismatchException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ElectronicShopTest {

	@Nested
	@DisplayName("Testing calculations")
	class CalculationTest {
		
		@Test
		@DisplayName("Can buy both items")
		final void testCanBuy() {
			int[] keyboards = {1,1,1};
			int[] drives = {1,1,1};
			int budget = 2;
			int actual = ElectronicShop.getMoneySpent(keyboards, drives, budget);
			assertEquals(2, actual, "Should return sum of one element from each array equal or smaller than budget.");
		}
		
		@Test
		@DisplayName("Can not buy both items")
		final void testCannotBuy() {
			int[] keyboards = {1,1,1};
			int[] drives = {1,1,1};
			int budget = 1;
			int actual = ElectronicShop.getMoneySpent(keyboards, drives, budget);
			assertEquals(-1, actual, "Should return -1 as it is not possible to purchase two items.");
		}
	}
	

	@Test
	@DisplayName("Testing negative input")
	final void testNegativeInput() {
		fail("Not yet implemented"); // TODO
	}
	
	@Test
	@DisplayName("Testing input as double digit")
	final void testDoubleInput() {
		fail("Not yet implemented"); // TODO
	}
	
	@Test
	@DisplayName("Testing input as string")
	final void testStringInput() {
		fail("Not yet implemented"); // TODO
	}

}
