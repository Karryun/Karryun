import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		String abc = "abcdefghijklmnopqrstuvwxyz";
		
		String[] senarr = new String[t];
		char[] ans = new char[t];
		

		for (int tc = 0; tc < t; tc++) {
			String s = sc.nextLine().trim();
			senarr[tc] = s;
		}

		for (int tc = 0; tc < t; tc++) {
			int[] ansarr = new int[26];
			String[] tmparr = senarr[tc].split(" ");

			for (int i = 0; i < tmparr.length; i++) {
				for (int j = 0; j < tmparr[i].length(); j++) {
					String one = tmparr[i].substring(j, j + 1);
					int idx = abc.indexOf(one);
					ansarr[idx]++;
				}

			}

			int max = 0;
			int ansidx = 0;
			for (int i = 0; i < ansarr.length; i++) {
				if (max < ansarr[i]) {
					max = ansarr[i];
					ansidx = i;
				}

			}
			boolean isdup = false;
			for (int i = 0; i < ansarr.length; i++) {
				if (max == ansarr[i] && i != ansidx) {
					isdup = true;
					break;
				}

			}

			if (isdup) {
				ans[tc] = '?';
			} else {
				ans[tc] = (abc.charAt(ansidx));
			}
			ansidx = 0;

		}

		for (int i = 0; i < t; i++) {
			System.out.println(ans[i]);
		}
		
	}

}
