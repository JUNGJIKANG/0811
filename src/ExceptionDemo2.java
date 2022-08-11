
public class ExceptionDemo2 {
	public static void main(String[] args) {
		a();
	}

	static void a() {
		try {
			b();
		} catch (ArithmeticException ex) {
			System.out.println("Exception in thread \"main\" java.lang.ArithmeticException: / by zero");
		}
	}

	static void b() {
		c();
	}

	static void c() {
		d();
	}

	static void d() {
		System.out.println(5 / 0);
	}
}