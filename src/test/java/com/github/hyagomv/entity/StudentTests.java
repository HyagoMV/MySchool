package com.github.hyagomv.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import org.junit.jupiter.api.Test;

public class StudentTests {

	@Test
	void studentIsCorret() {
		UUID uuid = UUID.randomUUID();
		Student student = Student.Factory.create(uuid.toString(), "valid", "valid@valid.com");
		
		assertEquals(uuid, student.getId());
		assertEquals("valid", student.getName().getValue());
		assertEquals("valid@valid.com", student.getEmail().getValue());
	}
}
