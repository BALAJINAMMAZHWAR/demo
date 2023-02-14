package com.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TestRunnerAdactin extends com.Baseclass.BaseClass {
	public static WebDriver driver; // null

	public static void main(String[] args) throws Throwable {
		driver = launchBrowser("chrome");
		launchUrl("https://adactinhotelapp.com/");
		// navigateTo("https://www.google.com/");
		// navigateBack();
		// navigateRefresh();
		WebElement un = driver.findElement(By.id("username"));
		passInput(un, "balajinammazhwar");
		Thread.sleep(2000);
		WebElement pw = driver.findElement(By.id("password"));
		passInput(pw, "priyabala89");
		Thread.sleep(2000);
		WebElement li = driver.findElement(By.id("login"));
		clickOnElement(li);
		WebElement loca = driver.findElement(By.id("location"));
		dropDown(loca, "value", "Sydney", 0);
		WebElement sh = driver.findElement(By.id("hotels"));
		dropDown(sh, "value", "Hotel Creek", 0);
		WebElement sr = driver.findElement(By.id("room_type"));
		dropDown(sr, "value", "Deluxe", 2);
		WebElement nr = driver.findElement(By.id("room_nos"));
		dropDown(nr, "value", "1", 0);
		WebElement apr = driver.findElement(By.id("adult_room"));
		dropDown(apr, "value", "", 0);
		WebElement cpr = driver.findElement(By.id("child_room"));
		driver.findElement(By.id("Submit")).click();

	}
}
