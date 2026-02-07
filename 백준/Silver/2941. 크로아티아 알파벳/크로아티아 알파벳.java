import java.util.*;

public class Main {

	static String[] cro = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int count = 0;

		for (int i = 0; i < word.length() - 2 + 1; i++) {
			String one = word.substring(i, i + 2);
			for (int j = 0; j < cro.length; j++) {
				if (one.equals(cro[j])) {
					count++;
					break;
				} else if (one.equals("dz") && i+3 <= word.length() && word.substring(i + 2, i + 3).equals("=")) {
					count++;
					break;
				}
			}
		}

		System.out.println(word.length() - count);

	}

}
