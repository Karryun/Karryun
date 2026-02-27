import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int[] arr = new int[s1 + s2 + s3 + 1]; // 빈도수 저장 배열
		int max = Integer.MIN_VALUE; // 가장 많은 빈도수
		
		for (int i = 1; i <= s1; i++) {
			for (int j = 1; j <= s2; j++) {
				for (int k = 1; k <= s3; k++) {
					arr[i + j + k]++;
				}
			}
		}
		
		// 빈도수가 가장 많은 곳 찾기
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) max = arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				System.out.println(i);
				break;
			}
		}
	}
}
