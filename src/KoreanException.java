/*
 * 사용자 정의형 Exception
 * 1. 상속을 누구에게 받는가(runtime의 자식인가 아닌가)
 * 2. 유저에게 메시지를 보내려면 생성자를 잘 만들자.
 * 
 * KoreanException은 RuntimeException의 
 */
public class KoreanException extends RuntimeException {
	public KoreanException(String msg) {
		super(msg);
	}
}
