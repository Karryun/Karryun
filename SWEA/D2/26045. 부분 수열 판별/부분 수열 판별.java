import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt(); //a수열의 길이
			int m = sc.nextInt();
			int[] narr = new int[n];
			int[] marr = new int[m];
			String ans = "YES";
			
			for (int i = 0; i < n; i++) {
				narr[i] = sc.nextInt();
			}
			
			for (int i = 0; i < m; i++) {
				marr[i] = sc.nextInt();
			}
			
			int idx = 0;
			for (int i = 0; i < m; i++) { // b 수열 끝까지 돌기
				boolean isbubun = false;
				for (int j = idx; j < n; j++) { // a 수열 하나하나
					if (marr[i] == narr[j]) {
						idx = j;
						idx++;
						isbubun = true;
						break;
					}
				}
				if (!isbubun) {
					ans = "NO";
					break;
					}
				}
			System.out.println("#" + tc + " " + ans);
		}
	}
}