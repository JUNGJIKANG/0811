/**
 * <h1><font color="yellow">Final 용법 3가지</font></h1>
 * <ul>
 * <li><b>fiinal variable</b> : JAVA의 상수</li>
 * <li><b>Final Method</b> : Override의 금지</li>
 * <li><b>Final Class</b> : 상속금지</li>
 * </ul>
 * 
 * @author JUNG JIKANG
 * @version 1.1
 * @since 2022.08.11
 */
public class FinalDemo extends Parents {
	private final double PI = Math.PI; // member constatnt
	private static final boolean FLAG = true; // static constant

	public static void main(String[] args) {
		final String NAME = "정지강"; // local constatnt

	}

	final class Parents {
		public void display() {
			System.out.println("나는 부모의 메소드");
		}
	}
}
//
//	@Override
//	public void print() {
//		System.out.println("나는 자식의 메소드");
//	}
//
//	abstract class Super {
//		public void display() {System.out.println("나는 자식의 메소드");}
//
//public void print();