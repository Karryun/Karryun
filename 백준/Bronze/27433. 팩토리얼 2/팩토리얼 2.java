
import java.util.*;

public class Main {

	static long[] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		memo = new long[n + 1];
		memo[0] = 1;
		if (n >= 1) memo[1] = 1;
		System.out.println(fact(n));

	}

	public static long fact(int n) {
		if (n <= 1) return memo[n];
		
		if (n >= 2 && memo[n] == 0) {
			memo[n] = n * fact(n - 1);
		}
		return memo[n];
	}

}
