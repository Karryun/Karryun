import java.util.*;

public class Solution {

	// 위 오른쪽 아래 왼쪽
	static int[] updown = { -1, 0, 1, 0 };
	static int[] side = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int cnt = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			// 우주 괴물 행과 열 찾기
			int monRow = 0;
			int monCol = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] == 2) {
						monRow = i;
						monCol = j;
						break;
					}
				}
			}
			
			for (int k = 0; k < 4; k++) {
				for (int p = 1; p <= n; p++) {
					int nr = monRow + updown[k] * p;
					int nc = monCol + side[k] * p;
					
					if (nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] == 1) break;
					
					arr[nr][nc] = 3;
				}
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] == 0) cnt++;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}
	}
}