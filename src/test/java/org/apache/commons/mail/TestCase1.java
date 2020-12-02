package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class TestCase1 extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddCc() throws EmailException {
		System.out.println("This is testing if a CC was added");
		testEmail.addCc("a@c.com");
		assertEquals("a@c.com", testEmail.getCcAddresses().get(0).toString());
	}

}
