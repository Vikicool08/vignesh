package org.testt;
import org.testng.annotations.Test;
public class Test2 {
@Test
	private void tc20() {
	System.out.println("Test 2 Thread count:"+Thread.currentThread().getId());
	}
	@Test
	private void tc21() {
		System.out.println("Test 2 Thread count:"+Thread.currentThread().getId());
	}
	@Test
	private void tc22() {
		System.out.println("Test 2 Thread count:"+Thread.currentThread().getId());
	}
}
