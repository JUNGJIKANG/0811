/*
 * 메소드의 오버라이드 조건 세가지
 * 1. 이름, 리턴타입, 괄호가 같아야한다.
 * 2. 메소드의 접근제한자는 부모보다 같거나 더 넓어야한다.
 * 3. 자식의 익셉션은 부모의 익셉션보다 더 적어야한다.
 */
public class Lion extends Mammal {

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub

	}

}
