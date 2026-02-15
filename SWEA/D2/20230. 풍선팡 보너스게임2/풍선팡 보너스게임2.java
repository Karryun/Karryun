import java.util.*;

import javax.imageio.ImageTranscoder;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int max = Integer.MIN_VALUE;
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int sum = -arr[i][j]; // 2번 더해지기 때문에 1번 빼주기
					for (int k = 0; k < n; k++) {
						sum = sum + arr[i][k] + arr[k][j];
					}
					max = Math.max(max, sum);
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}