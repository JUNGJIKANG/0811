import java.util.Scanner;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 : ");
		int kor = sc.nextInt();
		System.out.println("수학점수 : ");
		int mat = sc.nextInt();
		try {
			Student1 jikang = new Student1(kor, mat);
		} catch (KoreanException e) {
			System.out.println("e.getmessage()");
		} catch (MathException e) {
			System.out.println("e.getmessage()");
		}

	}
}

class Student1 {
	private int kor, mat;

	public Student1(int kor, int mat) throws KoreanException, MathException {
		if (kor >= 0 && kor <= 100)
			this.kor = kor;
		else
			throw new KoreanException("국어점수는 0점부터 100점까지입니다.");
		if (mat >= 0 && mat <= 100)
			this.mat = mat;
		else
			throw new MathException("수학점수는 0점부터 100점까지입니다.");
	}

	@Override
	public String toString() {
		return "Student [kor=" + kor + "]";
	}

	public void Student11(int kor, int mat) {
		this.kor = kor;
		this.mat = mat;
	}

}