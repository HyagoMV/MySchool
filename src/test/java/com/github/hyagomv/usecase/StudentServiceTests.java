package com.github.hyagomv.usecase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.github.hyagomv.entity.Student;
import com.github.hyagomv.repository.StudentRepository;

@ExtendWith(MockitoExtension.class)
class StudentServiceTests {

	@Mock
	StudentRepository repository;
	
	@InjectMocks
	StudentService service;
	
	@Test
	void saveNewStudent() {
//		Student student = Student.Factory.create(UUID.randomUUID().toString(), "valid", "valid@valid.com");
//		
//		when(repository.save(student)).thenReturn(student);
//		
//		assertEquals(student, service.save(student));
	}
	
//	@Test
	void deleleExistingStudent() {
		
	}
}
