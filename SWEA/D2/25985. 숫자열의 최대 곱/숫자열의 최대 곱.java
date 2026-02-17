import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] narr = new int[n];
			int[] marr = new int[m];
			int max = Integer.MIN_VALUE;
			
			for (int i = 0; i < n; i++) {
				narr[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				marr[i] = sc.nextInt();
			}
			
			if (m >= n) { // m의 길이가 더 길 경우
				for (int i = 0; i < n+m-1; i++) { // 확인할 경우의 수
					int sum = 0; // n+m-1이라는 경우의 수마다 초기화 해줘야 하니깐
					for (int j = 0; j < n; j++) { // 작은 수 배열만큼 돌아야지
						if (i - n + 1 + j < 0 || i - n + 1 + j >= m) continue;
						sum = sum + (marr[i - n + 1 + j] * narr[j]);
					}
					if (max < sum) max = sum;
				}
			}
			
			if (m < n) { // n의 길이가 더 길 경우
				for (int i = 0; i < n+m-1; i++) { // 확인할 경우의 수
					int sum = 0; // n+m-1이라는 경우의 수마다 초기화 해줘야 하니깐
					for (int j = 0; j < m; j++) { // 작은 수 배열만큼 돌아야지
						if (i - m + 1 + j < 0 || i - m + 1 + j >= n) continue;
						sum = sum + (narr[i - m + 1 + j] * marr[j]);
					}
					if (max < sum) max = sum;
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}