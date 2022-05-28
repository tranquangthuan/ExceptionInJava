package vn.com.fsoft.fa.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import vn.com.fsoft.fa.exception.checked.BirthDayException;
import vn.com.fsoft.fa.exception.unchecked.UnCheckedException;

public class ValidateUtils {
	public static boolean validateJavaDate(String strDate) throws BirthDayException {
		if (strDate.trim().equals("")) {
			return true;
		} else {
			SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
			sdfrmt.setLenient(false);
			try {
				sdfrmt.parse(strDate);
				System.out.println(strDate + " is valid date format");
			} catch (ParseException e) {
				throw new BirthDayException();
			}
			return true;
		}
	}

	public static boolean validateInputNumber(int i) {
		if (i == 0) {
			throw new UnCheckedException();
		}
		return true;
	}
}
