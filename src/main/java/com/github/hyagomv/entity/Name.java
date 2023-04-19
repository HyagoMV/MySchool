package com.github.hyagomv.entity;

public class Name {

	private final String value;

	private Name(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	// ------------------------

	public static class Factory {

		public static Name create(String value) {
			checkRules(value);
			
			return new Name(value);
		}

		private static void checkRules(String value) {
			nameCannotBeNull(value);
			nameCannotBeEmpty(value);
			nameCannotBeLessThanThreeLetters(value);
			nameCanOnlyHaveLetters(value);
		}

		private static void nameCannotBeNull(String value) {
			if (value == null)
				throw new RuntimeException("Name cannot be null");
		}

		private static void nameCannotBeEmpty(String value) {
			if (value.equals(""))
				throw new RuntimeException("Name cannot be empty");
		}
		
		private static void nameCannotBeLessThanThreeLetters(String value) {
			if (value.length() < 4)
				throw new RuntimeException("Student name cannot be less than three letters");
		}
		
		private static void nameCanOnlyHaveLetters(String value) {
			if (!value.toLowerCase().matches("[a-záâãéêôõç ]+"))
				throw new RuntimeException("Student name can only have letters");
		}
	}
}
