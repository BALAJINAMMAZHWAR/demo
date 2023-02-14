package com.TestNG_Features;

import org.testng.annotations.Test;

public class GroupingConcept {
@Test(groups = "Dresses")
private void tShirt() {
System.out.println("T-SHIRT");
}
@Test(groups = "Dresses")
private void chineseCollarShirt() {
System.out.println("Manderin Collar Shirt");

}	
@Test(groups = "Gadgets")
private void smartWatch() {
System.out.println("Accessory");
}	
@Test(groups = "Gadgets")
	private void smartPhone() {
System.out.println("Electronics");
	}
@Test(groups = "Cosmetics")
	private void perfume() {
System.out.println("Deo");
	}
@Test(groups = "Cosmetics")
	private void faceCream() {
System.out.println("Ponds");
	}
	
}
