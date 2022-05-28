package vn.com.fsoft.fa.exception.checked;

import vn.com.fsoft.fa.exception.ValidateUtils;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			inputBirthDay();
		} catch (BirthDayException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void inputBirthDay() throws BirthDayException {
		String birthDay = "29/2/2022";
		if (ValidateUtils.validateJavaDate(birthDay)) {
			System.out.println("Birthday is valid");
		}
	}

}
