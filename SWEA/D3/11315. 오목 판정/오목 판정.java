import java.util.Scanner;

public class Solution {
	// 우상 우 우하 하
	static int[] updown = { -1, 0, 1, 1 };
	static int[] right = { 1, 1, 1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			char[][] arr = new char[n][n];
			String YesOrNo = "NO";

			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < n; j++) {
					arr[i][j] = s.charAt(j);
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] != 'o') continue;
					
					for (int k = 0; k < 4; k++) {
						int cnt = 1;
						for (int p = 1; p < 5; p++) { // 한 방향마다 오목인지 검정
							int nr = i + updown[k] * p;
							int nc = j + right[k] * p;
							
							if (nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] != 'o') {
								break;
							}
							cnt++;
						}
						if (cnt == 5) {
							YesOrNo = "YES";
							break;
						}
					}
				}
			}
			System.out.println("#" + tc + " " + YesOrNo);
		}
	}
}