package com.junit.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

class MultiplicationUtilTest {

	@Test
	void positiveTest() {
		Assert.assertEquals(2, MultiplicationUtil.multiplicatonOfTwoNumbers(1, 2), "positive case");
	}
}
