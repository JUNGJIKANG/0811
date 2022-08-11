/*
 * 1. close()는 반드시 파일을 열거나 DB를 열었을 떄 처리해야한다
 * 2, 그러기 윟선 finally 블록에 code()르ㅡㄹ 사용한다.
 * 3. 하지만 fianally블록이 너무 코드가 길어지기 때문에
 * 4. autoclseable인터페이스의 자식들은 finally안에 close()를 할 필요가 없기 때문에 finally block은 사용하지 않아도된다.
 * 5. 이 때 try block이 모두 끝나면 자동으로 해당 객체의 close()가 일어난다.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExcceptionDemo5 {
	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr = null;
		String line = null;
		try {
			br = new BufferedReader(new FileReader("C:/temp/sungjuk_utf8.dat"));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException ex) {
			System.out.println(ex);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}