package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class TestCase2 extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddCcMulti() throws EmailException {
		System.out.println("Test Case to see if two CC addresses were added");
		String [] testEmails = new String[] {"a@b.com", "b@c.com"};
		testEmail.addCc(testEmails);
		
		assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
		assertEquals("b@c.com", testEmail.getCcAddresses().get(1).toString());
	}

}
