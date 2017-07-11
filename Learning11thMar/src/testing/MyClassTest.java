package testing;

import junit.framework.TestCase;
import testJava8.MyClass;

public class MyClassTest extends TestCase {

	//@Test
	public void testMultiply() {
	  // MyClass is tested
	  MyClass tester = new MyClass();
	   
	  // Check if multiply(10,5) returns 50
	  assertEquals(50, tester.multiply(10, 5));
	 } 

}
