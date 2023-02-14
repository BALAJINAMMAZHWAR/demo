package com.MyntraTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraTask {
	public static WebDriver driver;// null by default
	public static Integer totalnumberofproducts; // null value initially
	public static Integer pricelist;
	public static WebElement brandName;
	private static Integer minPrice;
	public static WebElement subBrandName;
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Upcasting
		driver.get(
				"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
		System.out.println("Launched the Browser");
	}
	private static void productCount() {
		List<WebElement> allproducts = driver.findElements(By.xpath("//li[@class='product-base']"));
		totalnumberofproducts = allproducts.size();
		System.out.println("Total count of Products : " + totalnumberofproducts);
		for (WebElement product : allproducts) {
System.out.println("Product Brand name is :"+product.getText());
		}
	}

	private static void minimumPriceProduct() {
		List<Integer> pricelist = new ArrayList<Integer>();
		List<WebElement> allPrices = driver.findElements(
				By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']"));
		for (WebElement price : allPrices) {
			String priceText = price.getText().replaceAll("Rs. ", "");
			int priceValue = Integer.parseInt(priceText);
			pricelist.add(priceValue);

		}
		minPrice = Collections.min(pricelist);
		System.out.println("Minimum price of All Products: " + minPrice);

	}
	private static void maxPriceOfAllproducts() {

		List<Integer> pricelist = new ArrayList<Integer>();
		List<WebElement> allPrices = driver.findElements(
				By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']"));
		for (WebElement price : allPrices) {
			String priceText = price.getText().replaceAll("Rs. ", "");
			int priceValue = Integer.parseInt(priceText);
			pricelist.add(priceValue);

		}
		Integer maxPrice = Collections.max(pricelist);
		System.out.println("Maximum price of All Products : " + maxPrice);
		
	}

	private static void getBrandNameOfMinPrice(Integer minPrice) {
		 brandName = driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()="
				+ minPrice + "]//ancestor::div[@class='product-productMetaInfo']//h3[@class='product-brand']"));
		String type_of_Brand = brandName.getText();
		System.out.println("Minimum Price Brand Name: "+type_of_Brand);
	}
	private static void getSubBrandNameOfMinPrice(Integer minPrice) {
subBrandName = driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()="
		+ minPrice + "]//ancestor::div[@class='product-productMetaInfo']//h3[@class='product-brand']"));
String type_of_subBrand = subBrandName.getText();
System.out.println("Minimum Price Sub Brand Name: "+type_of_subBrand);
	}
	public static void main(String[] args) {
		browserLaunch();
		productCount();
		minimumPriceProduct();
		maxPriceOfAllproducts();
		getBrandNameOfMinPrice(minPrice);
		getSubBrandNameOfMinPrice(minPrice);
		
		
	}
}
