package testNg;

import org.testng.annotations.Test;

public class Employee {
	@Test(priority = -20)
	private void login() {
		}
	@Test(priority = -10)
	private void searchHotel() {
	}
	@Test
	private void selectHotel() {
	}
	@Test(invocationCount = 5)
	private void bookHotel() {
		
	}
	@Test(priority = 10)
	private void bookingConfirmation() {
	
	}
	
	
	
	
}
