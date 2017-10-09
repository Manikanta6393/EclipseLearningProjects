package org.mani.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mani.main.MessageUtil;

public class MessageUtilTest {

		String message = "Hello World";	
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test(timeout=0,expected=ArithmeticException.class)
	   public void testPrintMessage() {
	      assertEquals(message,messageUtil.printMessage());
	   }

}
