package vn.com.fsoft.fa.exception.checked;

public class BirthDayException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BirthDayException(String message) {
		super(message);
	}

	public BirthDayException() {
		super("Birthday Exception : please insert birthDay with format MM/dd/yyyy");
	}

}
