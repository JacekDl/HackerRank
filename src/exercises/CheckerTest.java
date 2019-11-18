package exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CheckerTest {

	@Test
	void firstScoreBeforeSecond() {
		Checker checker = new Checker();
		Player one = new Player("Name1", 1);
		Player two = new Player("Name2", 2);
		int actual = checker.compare(one, two);
		assertEquals(1, actual);
	}
	
	@Test
	void secondScoreBeforeFirst() {
		Checker checker = new Checker();
		Player one = new Player("Name1", 2);
		Player two = new Player("Name2", 1);
		int actual = checker.compare(one, two);
		assertEquals(-1, actual);
	}
	
	@Test
	void firstNameBeforeSecond() {				//same scores
		Checker checker = new Checker();
		Player one = new Player("aaa", 1);
		Player two = new Player("bbb", 1);
		int actual = checker.compare(one, two);
		assertEquals(-1, actual);
	}
	
	@Test
	void secondNameBeforeFirst() {				//same scores
		Checker checker = new Checker();
		Player one = new Player("bbb", 1);
		Player two = new Player("aaa", 1);
		int actual = checker.compare(one, two);
		assertEquals(1, actual);
	}
	
	@Test
	void sameNames() {							//same scores
		Checker checker = new Checker();
		Player one = new Player("aaa", 1);
		Player two = new Player("aaa", 1);
		int actual = checker.compare(one, two);
		assertEquals(0, actual);
	}

}
