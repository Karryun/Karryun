import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			
			if (s.equals("push_front")) {
				int m = sc.nextInt();
				stack.addFirst(m);
			} else if (s.equals("push_back")) {
				int m = sc.nextInt();
				stack.add(m);
			} else if (s.equals("pop_back")) {
				if (!stack.isEmpty()) System.out.println(stack.pollLast());
				else System.out.println(-1);
			} else if (s.equals("pop_front")) {
				if (!stack.isEmpty()) System.out.println(stack.pollFirst());
				else System.out.println(-1);
			} else if (s.equals("size")) { // size
				System.out.println(stack.size());
			} else if (s.equals("empty")) { // empty
				if (stack.isEmpty()) System.out.println(1);
				else System.out.println(0);
			} else if (s.equals("back")) { // back
				if (stack.isEmpty()) System.out.println(-1);
				else System.out.println(stack.peekLast());
			} else { // front
				if (stack.isEmpty()) System.out.println(-1);
				else System.out.println(stack.peekFirst());
			}
		}
	}
}