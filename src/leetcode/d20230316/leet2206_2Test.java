package leetcode.d20230316;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class leet2206_2Test {

	@Test
	void test1() {
		leet2206_2 o1 = new leet2206_2();
		assertTrue(o1.divideArray(new int[] {3, 2, 3, 2, 2, 2}));
	}
	
	@Test
	void test2() {
		leet2206_2 o1 = new leet2206_2();
		assertFalse(o1.divideArray(new int[] {1, 2, 3, 4}));
	}

}
