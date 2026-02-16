import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int[] pick = new int[n];

		for (int i = 0; i < n; i++) {
			pick[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) { // 넣을 숫자
			int num = pick[i - 1];

			if (i == 1) {
				list.add(i);
			} else {
				list.add(i - 1 - num, i);
			}

		}

		for (int ans : list) {
			System.out.print(ans + " ");
		}
	}
}
