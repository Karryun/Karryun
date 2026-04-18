import java.util.*;

public class Solution {

	static int[] dx = { 0, -1, 0, 1, 0 };
	static int[] dy = { 0, 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int[][] arr = new int[10][10];
			int m = sc.nextInt();
			int a = sc.nextInt(); // BC의 개수
			int[] userA = new int[m + 1];
			int[] userB = new int[m + 1];
			int[][] AP = new int[a][4]; // x좌표, y좌표, 충전 범위, 처리량 순
			int[] goA = new int[2];
			int[] goB = new int[2];

			goA[0] = 1;
			goA[1] = 1;
			goB[0] = 10;
			goB[1] = 10;

			int ans = 0;

			for (int i = 1; i <= m; i++) {
				userA[i] = sc.nextInt();
			}

			for (int i = 1; i <= m; i++) {
				userB[i] = sc.nextInt();
			}

			for (int i = 0; i < a; i++) {
				for (int j = 0; j < 4; j++) {
					AP[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i <= m; i++) {

				// 1. 일단은 움직여
				goA[0] += dy[userA[i]];
				goA[1] += dx[userA[i]];

				goB[0] += dy[userB[i]];
				goB[1] += dx[userB[i]];

				// 2. BC와의 위치를 찾아
				boolean[] canA = new boolean[a];
				boolean[] canB = new boolean[a];
				for (int k = 0; k < a; k++) {

					if (Math.abs(goA[0] - AP[k][0]) + Math.abs(goA[1] - AP[k][1]) <= AP[k][2]) {
						canA[k] = true;
					}

					if (Math.abs(goB[0] - AP[k][0]) + Math.abs(goB[1] - AP[k][1]) <= AP[k][2]) {
						canB[k] = true;
					}
				}

				// 3. 최적의 충전량 방법을 계산해
				int maxCnt = 0;
				
				for (int aIdx = 0; aIdx < a; aIdx++) {
					for (int bIdx = 0; bIdx < a; bIdx++) {
						int curSum = 0;
						int charA = 0;
						int charB = 0;
						
						if (canA[aIdx]) charA = AP[aIdx][3];
						if (canB[bIdx]) charB = AP[bIdx][3];
						
						if (aIdx == bIdx) curSum = Math.max(charA, charB);
						else curSum = charA + charB;
						
						maxCnt = Math.max(maxCnt, curSum);
					}
				}
				ans += maxCnt;
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}