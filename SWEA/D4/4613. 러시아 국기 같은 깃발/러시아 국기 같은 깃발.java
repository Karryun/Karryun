import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] arr = new int[n][m];
			int min = Integer.MAX_VALUE;
			
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < m; j++) {
					arr[i][j] = s.charAt(j);
				}
			}
			
			// i=W j=B k=R 경우의 수
			for (int i = 1; i <= n-2; i++) {
				for (int j = 1; j <= n-2; j++) {
					int k = n - i - j;
					int cnt = 0;
					if (k <= 0) continue; // 3개 색깔 모두 있어야 함.
					
					for (int p = 0; p < i; p++) {
						for (int q = 0; q < m; q++) {
							if (arr[p][q] != 'W') cnt++;
						}
					}
					
					for (int p = i; p < i + j; p++) {
						for (int q = 0; q < m; q++) {
							if (arr[p][q] != 'B') cnt++;
						}
					}
					
					for (int p = i + j; p < n; p++) {
						for (int q = 0; q < m; q++) {
							if (arr[p][q] != 'R') cnt++;
						}
					}
					min = Math.min(min, cnt);
				}
			}
			System.out.println("#" + tc + " " + min);
		}
	}
}