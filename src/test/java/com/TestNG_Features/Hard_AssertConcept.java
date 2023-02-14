package com.TestNG_Features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_AssertConcept{
@Test
	private void demo() {
		String exp= "Bala";
		String act= "Bala123";
	Assert.assertEquals(act,exp);	
System.out.println("Validation");

	}
	
}
