package com.github.hyagomv.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hyagomv.entity.Student;
import com.github.hyagomv.entity.StudentEntity;

public interface StudentRepository  extends JpaRepository<StudentEntity, UUID>{

}
