import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 :");
		int first = sc.nextInt();
		System.out.println("두 번째 숫자 :");
		int second = sc.nextInt();
		try {
			System.out.printf("%d/%d=%d\n", first, second, (first / second));
		} catch (NullPointerException ex) {
			System.out.println(
					"Exception in thread main java.lang.ArithmeticException: / by zero at ExceptionDemo.main(ExceptionDemo.java:11)");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(
					"Exception in thread main java.lang.ArithmeticException: / by zero at ExceptionDemo.main(ExceptionDemo.java:11)");
		} catch (NegativeArraySizeException ex) {
			System.out.println(
					"Exception in thread main java.lang.ArithmeticException: / by zero at ExceptionDemo.main(ExceptionDemo.java:11)");
		} catch (RuntimeException ex) {
			System.out.println(
					"Exception in thread main java.lang.ArithmeticException: / by zero at ExceptionDemo.main(ExceptionDemo.java:11)");
		}
	}
}

/*
 * Multiple Catch Block : 여러개의 Exception Type을 열거하는 방법
 *  - 주의할 점 : 위 아래 순서가 있다. 위쪽은 자식 익셉션, 아래는 부모 익셉션
 */