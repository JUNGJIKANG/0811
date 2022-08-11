
public class WrapperClassDemo {
	public static void main(String[] args) {
		// until JDK 1.4
//		int age = 26; // stack
//		Integer in = new Integer(age); // boxing, wrapping
//		int su = in.intValue(); // unboxing, unwrapping
//		System.out.println("su="+su);

		// since JDK 1.5
		Integer in = 26 + 5; // Integer in=new Integer(26+5); auto boxing방법
		int su = in + 100;
		System.out.println("su=" + su);
	}
}
