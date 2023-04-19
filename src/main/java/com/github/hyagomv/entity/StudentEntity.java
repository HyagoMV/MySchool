package com.github.hyagomv.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID uuid;
	private String name;
	private String email;
	
	public StudentEntity() {
		super();
	}

	public StudentEntity(UUID uuid, String name, String email) {
		this.uuid = uuid;
		this.name = name;
		this.email = email;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
