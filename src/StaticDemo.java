/**
 * 
 * <font color='red' size='5'>Static용법 4가지</font>
 * <ol>
 * <li><b>static variable</b> : 참조없이 class의 이름으로 접근하기 위한 공유변수</li>
 * <li><b>static method</b> : 참조없이 class의 이름으로 접근하기 위해서(공유변수 아니므로 주소없이 해당
 * method를 쓰고 싶을 때)</li>
 * <li><b>static initialization</b> : static 변수와 상수의 초기화</li>
 * <li><b>static class</b></li>
 * </ol>
 * 
 * @author JUNG JIKANG
 * @version 1.0
 * @since 2022.08.11
 *
 */
public class StaticDemo {
	private String name; // member variable
	private final double PI; // member constant
	private static int age; // static variable
	private static final boolean FLAG; // static constatnt

	{// initialization block (가장 먼저 실행되는 블록)
		this.name = "정지강"; // 멤버변수 초기화
		System.out.println("나는 생성자보다 먼저 호출되는데, 다시는 재호출 할 수 없다.");
	}

	public StaticDemo() {
		this.PI = 3.141592; // 멤버상수 초기화
		System.out.println("나는 생성자다.");
	}

	static { // static initialization block
		age = 26; // static 변수 초기화
		FLAG = true; // static 상수 초기화
		System.out.println("나는 static초기화 블록이다. 항상 제일 먼저 메모리에 올라온다.");
	}

	/**
	 * Program의 시작점
	 * @param_args : String Array
	 * @return_Nothing : 아무것도 리턴하지않는다.
	 * @see : www.naver.com
	 */
	public static void main(String[] args) {
		System.out.println("나이=" + age);
		System.out.println("FLAG=" + FLAG);
		StaticDemo sd = new StaticDemo(); // 이거 다시 설명 필요..
		System.out.println("이름=" + sd.name);
		System.out.println("PI=" + sd.PI);
	}
}
