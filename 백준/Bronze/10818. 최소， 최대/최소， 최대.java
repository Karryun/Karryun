import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			min = Math.min(min, m);
			max = Math.max(max, m);
		}
		System.out.println(min + " " + max);
	}
}