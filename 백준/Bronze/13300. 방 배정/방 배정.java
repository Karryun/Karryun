import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] arr = new int[2][6];
		int ans = 0;

		for (int i = 0; i < n; i++) {
			int gender = sc.nextInt();
			int grade = sc.nextInt() - 1;
			arr[gender][grade]++;
		}

		for (int i = 0; i < 2; i++) { // 성별로 하나씩 해버리기
			for (int j = 0; j < 6; j++) {
				if (arr[i][j] == 0) {
					ans += 0;
				} else if (arr[i][j] > k && arr[i][j] % k != 0) {
					ans = ans + (arr[i][j] / k) + 1;
				} else if (arr[i][j] > k && arr[i][j] % k == 0) {
					ans = ans + (arr[i][j] / k);
				} else {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
