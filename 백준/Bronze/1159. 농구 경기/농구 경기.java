import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String abc = "abcdefghijklmnopqrstuvwxyz";
		int[] abcarr = new int[26];

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			char one = s.charAt(0);
			int idx = abc.indexOf(one);
			abcarr[idx]++;
		}

		boolean gg = true;
		for (int i = 0; i < abcarr.length; i++) {
			if (abcarr[i] >= 5) {
				System.out.print(abc.substring(i, i + 1));
				gg = false;
			}

		}

		if (gg) {
			System.out.println("PREDAJA");
		}

	}

}
