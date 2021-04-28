package org.vk;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Sample {
	@Test(retryAnalyzer= Test.class)
	private void test1() {
		Assert.assertTrue(false);
	}
	@Test
	private void test35() {
		Assert.assertTrue(true);
	}
}
