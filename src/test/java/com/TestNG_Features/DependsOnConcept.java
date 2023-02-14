package com.TestNG_Features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsOnConcept {
	@Test
	@Ignore
	private void browserLaunch() {
System.out.println("Launched Browser");
	}
	@Test
	
	private void selectItem() {
System.out.println("Item Selected");
	}
@Test
	private void signIn() {
System.out.println("Signed In ");
	}
@Test
private void addToCart() {
System.out.println("Item Added to Cart");
}
@Test
	private void logOut() {
System.out.println("Logged Out");
	}
	
	
	
	
	
	
	
	
	
	
	
}
