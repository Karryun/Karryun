import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			
			if (s.equals("push")) {
				int m = sc.nextInt();
				stack.add(m);
			} else if (s.equals("pop")) {
				if (!stack.isEmpty()) System.out.println(stack.pollLast());
				else System.out.println(-1);
			} else if (s.equals("size")) {
				System.out.println(stack.size());
			} else if (s.equals("empty")) {
				if (stack.isEmpty()) System.out.println(1);
				else System.out.println(0);
			} else {
				if (stack.isEmpty()) System.out.println(-1);
				else System.out.println(stack.peekLast());
			}
		}
	}
}