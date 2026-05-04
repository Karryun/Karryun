import java.util.*;

public class Main {
	
	static int n, min, max;
	static int[] arr, oper;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		oper = new int[3];
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 3; i++) {
			oper[i] = sc.nextInt();
		}
		
		dfs(0, arr[0], 1);
		
		System.out.println(min + " " + max);
	}
	
	private static void dfs(int cnt, int num, int idx) {
		if (cnt == n - 1) {
			min = Math.min(min, num);
			max = Math.max(max, num);
			return;
		}
		
		for (int i = 0; i < 3; i++) {
			if (oper[i] > 0) {
				oper[i]--;
				if (i == 0) dfs(cnt + 1, num + arr[idx], idx + 1);
				if (i == 1) dfs(cnt + 1, num - arr[idx], idx + 1);
				if (i == 2) dfs(cnt + 1, num * arr[idx], idx + 1);
				oper[i]++;
			}
		}
	}
}
