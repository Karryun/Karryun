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
			int ans = Integer.MIN_VALUE; // 가장 긴 등산로의 길이

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) { // 모든 좌표 다 탐색 예정
					int len = 1;
					int gizunRow = i; // 상하좌우 기준이 될 행
					int gizunCol = j; // 상하좌우 기준이 될 열
					int gizunMin = arr[i][j]; // 상하좌우 기준이 될 값 (이것보다 무조건 작아야됨)
					int tmpRow = 0;
					int tmpCol = 0;
					int tmpMin = gizunMin; // 여기에 상하좌우 조사한 값 중 가장 작은 값 넣을 예정
					
					while (true) { // 등산로 조건 만족하는 끝까지 돌기
						for (int k = 0; k < 4; k++) {
							int nr = gizunRow + updown[k];
							int nc = gizunCol + side[k];
							
							if (nr >= 0 && nr < n && nc >= 0 && nc < n) { // 만족하는 값일 때
								// 상하좌우 조사한 값들보다 작아야함!
								if (tmpMin > arr[nr][nc]) {
									tmpMin = arr[nr][nc]; // 반복문 끝나면 이게 그 다음으로 갈 기준
									tmpRow = nr; 
									tmpCol = nc; 
								}
							}	
						}
						// 상하좌우 다 돌아봤는데 기준보다 작은 값이 없는 경우니 나오기
						if (gizunMin == tmpMin) break;
						gizunRow = tmpRow;
						gizunCol = tmpCol;
						gizunMin = tmpMin;
						len++;
					} // 여기까지 while 문
					ans = Math.max(ans, len);
				} // 여기까지 한 좌표에 대한 탐색 끝내야 함
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}