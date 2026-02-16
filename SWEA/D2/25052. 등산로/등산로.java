import java.awt.image.Kernel;
import java.util.Scanner;

public class Solution {
	// 상 하 좌 우
	static int[] updown = { -1, 1, 0, 0 };
	static int[] side = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int ans = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int gizunRow = i;
					int gizunCol = j;
					int len = 1;
					while (true) {
						int gizun = arr[gizunRow][gizunCol];
						int tmpRow = i;
						int tmpCol = j;
						int tmpMin = Integer.MAX_VALUE;
						boolean find = false;

						for (int k = 0; k < 4; k++) {
							int nr = gizunRow + updown[k];
							int nc = gizunCol + side[k];

							if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
								if (gizun > arr[nr][nc]) {
									if (tmpMin > arr[nr][nc]) {
										tmpRow = nr;
										tmpCol = nc;
										tmpMin = arr[nr][nc];
										find = true;
									}
								}
							}
						}
						gizunRow = tmpRow;
						gizunCol = tmpCol;
						gizun = tmpMin;
						len++;

						if (!find) {
							ans = Math.max(ans, len);
							break;
						}
					}

				}
			}
			System.out.println("#" + tc + " " + (ans - 1));
		}
	}
}