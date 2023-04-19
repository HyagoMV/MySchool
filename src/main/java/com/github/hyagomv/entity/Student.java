package com.github.hyagomv.entity;

import java.util.UUID;

public class Student {
	
	private final UUID id;
	private Name name;
	private Email email;

	private Student(UUID id, Name name, Email email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public UUID getId() {
		return id;
	}

	// ------------

	public static class Factory {

		public static Student create(String uuid, String name, String email) {
			checkRules(uuid);
			
			return new Student(UUID.fromString(uuid), Name.Factory.create(name), Email.Factory.create(email));
		}

		private static void checkRules(String uuid) {
			uuidCannotBeNull(uuid);
		}

		private static void uuidCannotBeNull(String uuid) {
			if (uuid == null)
				throw new RuntimeException("UUID cannot be null");
		}
	}

}
