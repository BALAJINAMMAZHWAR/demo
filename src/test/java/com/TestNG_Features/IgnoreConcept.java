package com.TestNG_Features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreConcept {
	@Test
	@Ignore
private void carTech() {
System.out.println("CruiseControl");
}
	@Test(enabled = false)
	private void bikeTech() {
System.out.println("SingleChannelABS");
	}
	@Test
	private void eBike() {
System.out.println("Hero e Bikes");
	}
	@Test
	private void carTech1() {
System.out.println("ADAS");
	}
	
}
