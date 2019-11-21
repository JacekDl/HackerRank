package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class HurdleRaceTest {

	@Nested
	@DisplayName("Testing hurdleRace method.")
	class HurdleRacePassTest{
		
		@Test
		@DisplayName("Jump higher than the highest hurdle")
		final void testJumpHigher() {
			int expected = 0;
			int jump = 2;
			int[] hurdles = {1,1,1};
			int actual = HurdleRace.hurdleRace(jump, hurdles);
			assertEquals(expected, actual, "Number of potions should equal 0.");
		}
		
		@Test
		@DisplayName("Jump equal to the highest hurdle")
		final void testJumpEquals() {
			int expected = 0;
			int jump = 2;
			int[] hurdles = {1,1,2};
			int actual = HurdleRace.hurdleRace(jump, hurdles);
			assertEquals(expected, actual, "Number of potions should equal 0.");
		}
		
		@Test
		@DisplayName("Jump lower than the highest hurdle")
		final void testJumpLower() {
			int expected = 1;
			int jump = 1;
			int[] hurdles = {1,1,2};
			int actual = HurdleRace.hurdleRace(jump, hurdles);
			assertEquals(expected, actual, "Number of potions should equal 1.");
		}
	}
	

	@Test
	final void testMain() {
		fail("Not yet implemented"); // TODO
	}

}
