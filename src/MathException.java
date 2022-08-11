/*
 * CheckedException
 * 1. 반드시 try~catch를 하던디
 * 2. 메소드 선언부의 throws MathException을 쓰던지
 */
public class MathException extends Exception {
public MathException(String msg) {
	super(msg);
}
}
