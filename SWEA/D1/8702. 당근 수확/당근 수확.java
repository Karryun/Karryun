import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int min = Integer.MAX_VALUE;
			int carSum = 0;
			int worker1 = 0;
			int worker2 = 0;
			int ansIdx = 0;

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {
				carSum += arr[i];
			}

			int gizun = carSum / 2;

			while (gizun >= worker1) {
				worker1 += arr[ansIdx];
				ansIdx++;
			}

			for (int i = ansIdx; i < n; i++) {
				worker2 += arr[i];
			}

			while (true) {
				int diff1 = Math.abs(worker1 - worker2);
				int diff2 = Math.abs((worker1 - arr[ansIdx - 1]) - (worker2 + arr[ansIdx - 1]));

				if (diff1 > diff2) {
					worker1 = worker1 - arr[ansIdx - 1];
					worker2 = worker2 + arr[ansIdx - 1];
					ansIdx--;
				} else {
					min = diff1;
					break;
				}
			}

			System.out.println("#" + tc + " " + ansIdx + " " + min);

		}
	}
}