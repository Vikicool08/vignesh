package org.testt;
import org.testng.annotations.Test;
public class Test1 {
	@Test
	private void tc10() {
	System.out.println("Test 1 Thread count:"+Thread.currentThread().getId());
	}
	@Test
	private void tc11() {
		System.out.println("Test 1 Thread count:"+Thread.currentThread().getId());
	}
	@Test
	private void tc12() {
		System.out.println("Test 1 Thread count:"+Thread.currentThread().getId());
	}
	@Test
	private void tc15() {
	System.out.println("Test 1 Thread count:"+Thread.currentThread().getId());
	}
	@Test
	private void tc18() {
		System.out.println("Test 1 Thread count:"+Thread.currentThread().getId());
	}
	@Test
	private void tc19() {
		System.out.println("Test 1 Thread count:"+Thread.currentThread().getId());
	}
	@Test
	private void tc14() {
	System.out.println("Test 1 Thread count:"+Thread.currentThread().getId());
	}
	@Test
	private void tc16() {
		System.out.println("Test 1 Thread count:"+Thread.currentThread().getId());
	}
	@Test
	private void tc17() {
		System.out.println("Test 1 Thread count:"+Thread.currentThread().getId());
	}
}
