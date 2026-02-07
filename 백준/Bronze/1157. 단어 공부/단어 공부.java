import java.awt.AlphaComposite;
import java.awt.print.Printable;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String large = word.toUpperCase();
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] many = new int[26]; // 최빈값 배열
		String[] arr = new String[26]; // 알파벳 배열

		for (int i = 0; i < abc.length(); i++) {
			String alpha = abc.substring(i, i + 1);
			arr[i] = alpha;
		}

		for (int i = 0; i < large.length(); i++) {
			String s = large.substring(i, i + 1);
			int idx = Arrays.asList(arr).indexOf(s);
			many[idx]++;
		}

		int max = 0;
		int ansidx = 0;
		for (int i = 0; i < many.length; i++) {
			if (max < many[i]) {
				max = many[i];
				ansidx = i;
			}
		}

		boolean issame = false;
		for (int i = 0; i < many.length; i++) {
			if (many[i] == many[ansidx] && arr[i] != arr[ansidx]) {
				issame = true;
			}
		}

		if (issame) {
			System.out.println("?");
		} else {
			System.out.println(arr[ansidx]);
		}

	}

}
