package com.github.hyagomv.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class EmailTests {

	static RuntimeException e;
	
	@Test
	void emailIsCorret() {
		Email email = Email.Factory.create("valid@valid.com");
		assertEquals("valid@valid.com", email.getValue());
	}
	
	@Test
	void emailCannotBeNull() {
		e = assertThrows(RuntimeException.class, () -> Email.Factory.create(null));
		assertEquals("Email cannot be null", e.getMessage());
	}
	
	@Test
	void emailCannotBeEmpty() {
		e = assertThrows(RuntimeException.class, () -> Email.Factory.create(""));
		assertEquals("Email cannot be empty", e.getMessage());
	}
	
	@Test
	void emailMustBeValidFormat() {
		e = assertThrows(RuntimeException.class, () -> Email.Factory.create("invalid@"));
		assertEquals("Email is not valid", e.getMessage());
	}
}
