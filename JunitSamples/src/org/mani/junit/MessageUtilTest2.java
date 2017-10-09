package org.mani.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mani.main.MessageUtil;

public class MessageUtilTest2 {

		String message = "Manikanta";	
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testSalutationMessage() {
	      assertEquals("Hi!" + "Manikanta",messageUtil.salutationMessage());
	   }

}
