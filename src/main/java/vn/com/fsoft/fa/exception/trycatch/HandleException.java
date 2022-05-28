package vn.com.fsoft.fa.exception.trycatch;

public class HandleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// noHandleException();
		withHandleException();
	}

	private static void withHandleException() {
		try {
			int data = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}

	private static void noHandleException() {
		int data = 50 / 0;
		System.out.println("rest of the code...");
	}

}
