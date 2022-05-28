package vn.com.fsoft.fa.exception.finalpackage;

public class FinalDemo {
	public static void main(String[] args) {
		// finalDemo1();
//		finalDemo2();
		finalWithReturn();
	}

	private static void finalDemo1() {
		try {
			int data = 25 / 5;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}

	private static void finalDemo2() {
		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}

	private static void finalWithReturn() {
		try {
			int data = 25;
			if (data % 2 != 0) {
				System.out.println(data + " is odd number");
				return;
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
