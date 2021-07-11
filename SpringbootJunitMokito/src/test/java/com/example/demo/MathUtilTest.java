package com.example.demo;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class MathUtilTest {

	@Test
	void additionPositiveCheck() {
		// fail("Not yet implemented");
		Assert.assertEquals(3, MathUtil.add(1, 2), "Success case");
	}

	@Test
	void additionNegativeCheck() {
		Assert.assertEquals(3, MathUtil.add(1, 2), "Failure case");
	}

	/**
	 * Can write the final state of test case even if the actual method
	 * implementation si not yet started driven)
	 */
	@Test
	void testComputeCircleRadius() {
		Assert.assertEquals(314.1592653589793238, MathUtil.computeCircleRadius(10), "Should return right circle area");
	}

	@Test
	void testDivision() {
		Assert.assertEquals(ArithmeticException.class,MathUtil.division(1, 2),
				"This may throw arithemetic exception");
	}
}
