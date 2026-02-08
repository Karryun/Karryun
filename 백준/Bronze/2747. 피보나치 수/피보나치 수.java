
import java.util.*;

public class Main {

	static int[] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		memo = new int[n + 1];
		memo[0] = 0;
		memo[1] = 1;
		System.out.println(mFibo(n));

	}

	public static int mFibo(int n) {
		if (n <= 1) return memo[n];
		
		if (n >= 2 && memo[n] == 0) {
			memo[n] = mFibo(n - 1) + mFibo(n - 2);
		}
		return memo[n];
	}

}
