package com.github.hyagomv.usecase;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.github.hyagomv.entity.Email;
import com.github.hyagomv.entity.Student;
import com.github.hyagomv.entity.StudentDto;
import com.github.hyagomv.entity.StudentEntity;
import com.github.hyagomv.repository.StudentRepository;

@Service
public class StudentService {

	private final StudentRepository repository;

	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}

	public StudentEntity save(StudentDto dto) {
//		Student student = Student.Factory.create(dto.getId(), dto.getName(), dto.getEmail());
		Student student = Student.Factory.create(UUID.randomUUID().toString(), dto.getName(), Email.Factory.create("v@v.com").getValue());

		StudentEntity entity = new StudentEntity(student.getId(), student.getName().getValue(),
				student.getEmail().getValue());

		return repository.save(entity);
	}

	public StudentEntity delete(StudentEntity student) {
		repository.delete(student);
		return student;
	}

}
