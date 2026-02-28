import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	// 우상 우하 좌하 좌상
	static int[] updown = { -1, 1, 1, -1 };
	static int[] side = { 1, 1, -1, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int max = -1;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = 1; i <= n - 2; i++) { // 가능한 행의 수
				for (int j = 0; j <= n - 3; j++) { // 가능한 열의 수
					for (int a = 1; a <= i; a++) { // 우상으로 가는 변 길이 경우 수
						for (int b = 1; b <= n - 1 - i; b++) { // 우하로 가는 변 길이 경우 수
							int row = i;
							int col = j;
							boolean canFour = true;
							ArrayList<Integer> list = new ArrayList<>();
							list.add(arr[row][col]);
							for (int s1 = 0; s1 < a; s1++) { // 우상 ㄱㄱ
								int nr = row + updown[0];
								int nc = col + side[0];
								if (nr < 0 || nr >= n || nc < 0 || nc >= n || list.contains(arr[nr][nc])) {
									canFour = false;
									break;
								}
								list.add(arr[nr][nc]);
								row = nr;
								col = nc;
							}

							for (int s2 = 0; s2 < b; s2++) { // 우하 ㄱㄱ
								int nr = row + updown[1];
								int nc = col + side[1];
								if (nr < 0 || nr >= n || nc < 0 || nc >= n || list.contains(arr[nr][nc])) {
									canFour = false;
									break;
								}
								list.add(arr[nr][nc]);
								row = nr;
								col = nc;
							}
							
							for (int s3 = 0; s3 < a; s3++) { // 좌하 ㄱㄱ
								int nr = row + updown[2];
								int nc = col + side[2];
								if (nr < 0 || nr >= n || nc < 0 || nc >= n || list.contains(arr[nr][nc])) {
									canFour = false;
									break;
								}
								list.add(arr[nr][nc]);
								row = nr;
								col = nc;
							}

							for (int s4 = 0; s4 < b - 1; s4++) { // 좌상 ㄱㄱ (처음 원위치와 중복되면 안되니 -1)
								int nr = row + updown[3];
								int nc = col + side[3];
								if (nr < 0 || nr >= n || nc < 0 || nc >= n || list.contains(arr[nr][nc])) {
									canFour = false;
									break;
								}
								list.add(arr[nr][nc]);
								row = nr;
								col = nc;
							}
							if (canFour) max = Math.max(max, list.size());
						}
					}
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}