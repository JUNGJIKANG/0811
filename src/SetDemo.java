import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		String[] array = { "지강", "서예", "지강", "둥이", "미코", "둥이" };
		for (String str : array) {
			hashSet.add(str);
			treeSet.add(str);
		}
		System.out.println(hashSet.size());
		System.out.println(hashSet);
		System.out.println(treeSet); // 내림차순, treeset은 소팅해서 저장
	}
}
