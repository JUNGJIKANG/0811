import java.util.Stack;

/*
 * Stack : LIFO(Last Input First Output)
 */
public class ListDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String[] array = { "지강", "서예", "지강", "둥이", "미코", "둥이" };
		for (String str : array) {
			stack.push(str);
		}
		System.out.println(stack.search("서예"));
//		System.out.print(stack.pop()); System.out.println(stack.size());
//		System.out.print(stack.pop()); System.out.println(stack.size());
//		System.out.print(stack.pop()); System.out.println(stack.size());
//		System.out.print(stack.pop()); System.out.println(stack.size());
//		System.out.print(stack.pop()); System.out.println(stack.size());
//		System.out.print(stack.pop()); System.out.println(stack.size());
//	
//		System.out.print(stack.peek()); System.out.println(stack.size());
//		System.out.print(stack.peek()); System.out.println(stack.size());
//		System.out.print(stack.peek()); System.out.println(stack.size());
	}
}
