package com.Runner;

import com.Baseclass.PojoA;

public class PojoB {
public static void main(String[] args) {
	PojoA a= new PojoA();
double decimal = a.getD();
System.out.println("Before Setter: "+decimal);
a.setD(25);
double print = a.getD();
System.out.println("After Setter: "+print);

int i = a.getI();
System.out.println("Before Setter: "+i);
a.setI(58);
int i2 = a.getI();
System.out.println("After Setter: "+i2);

}	
	
	
}
