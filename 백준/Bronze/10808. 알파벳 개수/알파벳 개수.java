import java.awt.AlphaComposite;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String abc = "abcdefghijklmnopqrstuvwxyz";
		String[] arr = new String[26];
		int[] ansarr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = abc.substring(i, i + 1);
		}

		for (int i = 0; i < word.length(); i++) {
			String alpha = word.substring(i, i + 1);
			int idx = Arrays.asList(arr).indexOf(alpha);
			ansarr[idx]++;
		}

		for (int i = 0; i < ansarr.length; i++) {
			System.out.print(ansarr[i] + " ");
		}

	}

}
