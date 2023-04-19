package com.github.hyagomv.entity;

public class Email {

	private final String value;

	public Email(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	// ------------------------

		public static class Factory {

			public static Email create(String value) {
				checkRules(value);
				
				return new Email(value);
			}

			private static void checkRules(String value) {
				emailCannotBeNull(value);
				emailCannotBeEmpty(value);
				emailMustBeValidFormat(value);
			}

			private static void emailCannotBeNull(String value) {
				if (value == null)
					throw new RuntimeException("Email cannot be null");
			}
			
			private static void emailCannotBeEmpty(String value) {
				if (value.equals(""))
					throw new RuntimeException("Email cannot be empty");
			}
			
			private static void emailMustBeValidFormat(String value) {
				if (!value.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"))
					throw new RuntimeException("Email is not valid");
			}
			
		}
	
}
