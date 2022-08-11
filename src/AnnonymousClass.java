
public class AnnonymousClass {
	public static void main(String[] args) {
		Demo d = new Demo() { // 익명객체
			@Override
			public void display() {
				System.out.println("나는 원형 메소드입니다.");
			}
			public void print() {
				System.out.println("나는 새로운 메소드");
			}
		}; // 매우 주의할 것 4라인부터 여기까지가 한 문장.
		d.display();
//		d.print(); //재정의하려는 클래스의 멤버가 아니기 때문에(정의되어 있지 않아서)
	}
}

class Demo {
	public void display() {
		System.out.println("나는 원형 메소드입니다.");
	}
}