import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int[] start = new int[n]; 
			int[] end = new int[n]; 
			int cnt = 0;
			
			for (int i = 0; i < n; i++) {
				start[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				end[i] = sc.nextInt();
			}
			
			for (int i = 0; i < n; i++) {
				if (start[i] != end[i]) {
					for (int j = i; j < n; j++) { // i 시작점부터 끝까지 다 바꾸기
						start[j] = Math.abs(start[j] - 1); 
					}
					cnt++;
					
					if (start.equals(end)) break;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}
	}
}