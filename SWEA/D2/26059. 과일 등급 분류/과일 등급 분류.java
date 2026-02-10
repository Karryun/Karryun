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

			// i = 하의 개수  / j = 중의 개수 / n - i - j = 상의 개수
			for (int i = low; i <= high; i++) { // i가 하에 들어갈 과일 개수 브루투포스
				for (int j = low; j <= high; j++) { // j가 중에 들어갈 과일 개수 브루투포스
					// n에서 하와 중 개수를 뺐을 때 low보다 작거나 high보다 크면 구할 필요가 없으니 skip 또한 나눌 경계선 앞뒤 숫자가 같아도 일어날 수 없는 경우니 skip
					if (n - i - j < low || n - i - j > high || arr[i-1] == arr[i] || arr[i+j-1] == arr[i+j]) { 
						continue;
					} else {
						int[] aarr = new int[i]; // 하 만큼의 배열 생성
						int[] barr = new int[j]; // 중 만큼의 배열 생성
						int[] carr = new int[n-i-j]; // 상 만큼의 배열 생성
						for (int a = 0; a < i; a++) {
							aarr[a] = arr[a];
						}
						
						for (int b = i; b < i + j; b++) {
							barr[b-i] = arr[b]; // 이래야 0부터 시작
						}
						
						for (int c = i + j; c < n - i - j; c++) {
							carr[c-i-j] = arr[c]; // 이래야 0부터 시작
						}
						
						int group1 = Math.abs(aarr.length - barr.length);
						int group2 = Math.abs(barr.length - carr.length);
						int group3 = Math.abs(carr.length - aarr.length);
						
						min = Math.min(min, Math.max(group1, Math.max(group2, group3)));		
					}
				}
			}
			if (min == Integer.MAX_VALUE) {
				System.out.println("#" + tc + " " + -1);
			} else {
				System.out.println("#" + tc + " " + min);
			}
		}
	}
}