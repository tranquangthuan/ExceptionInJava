package vn.com.fsoft.fa.exception.unchecked;

import vn.com.fsoft.fa.exception.ValidateUtils;

public class UnCheckedExceptionDemo {

	public static void main(String[] args) throws UnCheckedException {
		inputNumber();
	}

	private static void inputNumber() {
		if (ValidateUtils.validateInputNumber(0)) {
			System.out.println("Number input is valid");
		}
	}

}
