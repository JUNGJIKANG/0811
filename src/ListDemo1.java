import java.util.Vector;

public class ListDemo1 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(5, 3); // 5를 넘게되면 3을 추가해라
		System.out.print(vector.capacity() + ",");
		System.out.println(vector.size());
		vector.add("정지강");
		System.out.print(vector.capacity() + ",");
		System.out.println(vector.size());
		vector.add("정지강");
		System.out.print(vector.capacity() + ",");
		System.out.println(vector.size());
		vector.add("정지강");
		System.out.print(vector.capacity() + ",");
		System.out.println(vector.size());
		vector.add("정지강");
		System.out.print(vector.capacity() + ",");
		System.out.println(vector.size());
		vector.add("정지강");
		System.out.print(vector.capacity() + ",");
		System.out.println(vector.size());
		vector.add("정지강");
		System.out.print(vector.capacity() + ",");
		System.out.println(vector.size());
	}
}
