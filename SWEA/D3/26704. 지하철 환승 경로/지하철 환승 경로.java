import java.util.*;

public class Solution {

	static int n, m;
	static int[][] arr;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			n = sc.nextInt();
			m = sc.nextInt();
			arr = new int[n+1][n+1];
			
			for (int i = 0; i < m; i++) {
				arr[sc.nextInt()][sc.nextInt()] = 1;
			}
			
			int maxVisited = Integer.MIN_VALUE;
			int ansStart = 0;
			
			for (int i = 1; i <= n; i++) {
				visited = new boolean[n + 1];
				
				dfs(i);
				
				int cnt = 0;
				for (int j = 1; j <= n; j++) {
					if (visited[j]) cnt++;
				}
				
				if (cnt > maxVisited) {
					maxVisited = cnt;
					ansStart = i;
				}	
			}
			System.out.println("#" + tc + " " + ansStart);
		}
	}
	private static void dfs(int now) {
		visited[now] = true;
		
		for (int i = 1; i <= n; i++) {
			if (arr[now][i] == 1 && !visited[i]) dfs(i);
		}
	}
}