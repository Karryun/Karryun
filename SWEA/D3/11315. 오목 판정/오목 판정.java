import java.util.*;

public class Solution {
	// 우상 우 우하 하
	static int[] down = { -1, 0, 1, 1 };
	static int[] right = { 1, 1, 1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			char[][] arr = new char[n][n];
			boolean ans = false;
			
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < n; j++) {
					arr[i][j] = s.charAt(j);
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] == '.')
						continue;
					int row = i;
					int col = j;
					for (int k = 0; k < 4; k++) {
						boolean isfive = true;
						for (int p = 0; p < 5; p++) {
							int nr = row + (down[k] * p);
							int nc = col + (right[k] * p);

							if (nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] != 'o') {
								isfive = false;
								break;
							}
						}
						if (isfive) ans = true;
					}

				}
			}
			if (ans) System.out.println("#" + tc + " " + "YES");
			else System.out.println("#" + tc + " " + "NO");
		}
	}
}