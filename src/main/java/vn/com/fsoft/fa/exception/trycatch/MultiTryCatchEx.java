package vn.com.fsoft.fa.exception.trycatch;

public class MultiTryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		mutilTryCatchArithmeticFirst();
		tryCatchNested();
	}

	private static void mutilTryCatchArithmeticFirst() {
		try {
			int a[] = new int[5];
			a[6] = 0;
			int x = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handle");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handle");
		} catch (Exception e) {
			System.out.println("Exception common handle");
		}

		System.out.println("rest of the code...");
	}

	// Compiler error
//	private static void mutilTryCatchCommonFirst() {
//		try {
//			int a[] = new int[5];
//			a[6] = 0;
//			int x = 30 / 0;
//		} catch (Exception e) {
//			System.out.println("Exception common handle");
//		} catch (ArithmeticException e) {
//			System.out.println("ArithmeticException handle");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBoundsException handle");
//		}
//
//		System.out.println("rest of the code...");
//	}

	private static void tryCatchNested() {
		try {
			try {
				System.out.println("Thuc hien phep chia");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				int a[] = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			System.out.println("khoi lenh khac");
		} catch (Exception e) {
			System.out.println("xy ly ngoai le");
		}

		System.out.println("tiep tuc chuong trinh..");
	}

}
