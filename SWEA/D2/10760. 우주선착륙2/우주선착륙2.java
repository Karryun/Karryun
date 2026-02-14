import java.util.*;

public class Solution {
	// 상 우상 우 우하 하 좌하 좌 좌상
	static int[] updown = { -1, -1, 0, 1, 1, 1, 0, -1 };
	static int[] side = { 0, 1, 1, 1, 0, -1, -1, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt(); // 행
			int m = sc.nextInt(); // 열
			int[][] arr = new int[n][m];
			int ans = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int row = i;
					int col = j;
					int cnt = 0;
					for (int k = 0; k < 8; k++) {
						int nr = row + updown[k];
						int nc = col + side[k];
						
						if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
							continue;
						} 
						if (arr[i][j] > arr[nr][nc]) cnt++;	
					}
					if (cnt >= 4) ans++;
				}
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}