package day0411_generic;

import java.util.ArrayList;

interface A {
}

interface AA {
}

class B {
}

class C extends B implements A, AA {
}

public class GenericTest {

	public static void main(String[] args) {

		B bb = new C();
		A aa = new C();

		int a = 10;
		double b = 3.14;
		char c = '0';

		var var1 = 10;
		var var2 = 3.14;
		var var3 = '0';

		var list = new ArrayList<String>();

		Object obj1 = new B();
		Object obj2 = new C();
		
		System.out.println(plus(a, b));
		
		
	}
 
	static double plus(double a, double b) {
		
		return a+b;
	}
	
}
