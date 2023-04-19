package com.github.hyagomv.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NameTests {

	static RuntimeException e;
	
	@Test
	void nameIsCorret() {
		Name name = Name.Factory.create("áâãéêôõç test");
		assertEquals("áâãéêôõç test", name.getValue());
	}

	@Test
	void nameCannotBeNull() {
		e = assertThrows(RuntimeException.class, () -> Name.Factory.create(null));
		assertEquals("Student name cannot be null", e.getMessage());
	}

	@Test
	void nameCannotBeEmpty() {
		e = assertThrows(RuntimeException.class, () -> Name.Factory.create(""));
		assertEquals("Student name cannot be empty", e.getMessage());
	}
	
	@Test
	void nameCannotBeLessThranThreeLetters() {
		e = assertThrows(RuntimeException.class, () -> Name.Factory.create("abc"));
		assertEquals("Student name cannot be less than three letters", e.getMessage());
	}
	
	@Test
	void nameCanOnlyHaveLetters() {
		e = assertThrows(RuntimeException.class, () -> Name.Factory.create("1234"));
		assertEquals("Student name can only have letters", e.getMessage());
	}

}
