package com.TestNG_Features;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class ParallelTesting extends com.Baseclass.BaseClass {

	public static WebDriver driver;

	@Test
	private void flipkart() {
		launchBrowser("chrome");
	//	launchUrl("https://www.facebook.com/");
		launchUrl("https://www.google.com/");
		System.out.println("launched Browser  |"+Thread.currentThread().getId());
	}

	@Test
	private void googlePage() {
		launchBrowser("edge");
		launchUrl("https://www.google.com/");
		System.out.println("launched Browser  |"+Thread.currentThread().getId());
	}

	@Test
	private void amazon() {
		launchBrowser("firefox");
//		launchUrl("https://www.amazon.in/");
		launchUrl("https://www.google.com/");
		System.out.println("launched Browser  |"+Thread.currentThread().getId());
	}

}
