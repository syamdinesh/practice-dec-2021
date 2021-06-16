package com.example.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author syamd
 */
class MultiplicationUtilTest {

	@Test
	void positiveTest() {
		Assert.assertEquals(2, MultiplicationUtil.multiplicatonOfTwoNumbers(1, 2), "positive case");
	}
}
