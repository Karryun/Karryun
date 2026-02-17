import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int low = sc.nextInt();
			int high = sc.nextInt();
			int[] arr = new int[n];
			int min = Integer.MAX_VALUE;
			
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			for (int i = low; i <= high; i++) { // 하 등급 가능 경우 수
				for (int j = low; j <= high; j++) { // 중 등급 가능 경우 수
					int k = n - i - j; // k는 상 등급
					if (k < low || k > high) continue; // k가 low high 조건 못맞추면 끝
					if (arr[i - 1] == arr[i] || (i+j < n && arr[i+j-1] == arr[i+j])) continue;
					
					int big = Math.max(i, Math.max(j, k));
					int small = Math.min(i, Math.min(j, k));
					
					min = Math.min(min, big-small);
				}
			}
			if (min == Integer.MAX_VALUE) System.out.println("#" + tc + " " + -1);
			else System.out.println("#" + tc + " " + min);
		}
	}
}