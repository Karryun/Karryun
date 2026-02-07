import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static String[] abc = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
			"S", "T", "U", "V", "W", "X", "Y", "Z" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int[] ansarr = new int[26];

			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < s.length(); j++) {
					String one = s.substring(j, j + 1);
					int idx = Arrays.asList(abc).indexOf(one);
					ansarr[idx]++;
				}

			}

			int max = 0;
			int ansidx = 0;
			for (int i = 0; i < ansarr.length; i++) {
				if (ansarr[i] > max) {
					max = ansarr[i];
					ansidx = i;
				}
			}

			System.out.println("#" + tc + " " + abc[ansidx]);
		}

	}

}
