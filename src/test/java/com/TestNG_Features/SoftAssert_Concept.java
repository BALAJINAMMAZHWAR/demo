package com.TestNG_Features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Concept {

	@Test
	private void demo() {
		String exp= "Bala";
		String act= "Bala123";
	SoftAssert s= new SoftAssert();
	s.assertEquals(exp, act);
System.out.println("Verification");
	}
}
