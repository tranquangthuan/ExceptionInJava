package vn.com.fsoft.fa.exception.throwexception;

import vn.com.fsoft.fa.exception.checked.BirthDayException;

public class ThrowsExceptionDemo {
	public static void main(String[] args) {
		// validateWithUncheckException(13);
		try {
			validateWithCheckException(10);
		} catch (BirthDayException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void validateWithUncheckException(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome");
	}

	public static void validateWithCheckException(int age) throws BirthDayException {
		if (age < 18) {
			throw new BirthDayException();
		} else {
			System.out.println("welcome");
		}

	}
}
