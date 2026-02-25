import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] aarr = new int[n];
		Integer[] barr = new Integer[n];
		int min = 0;

		for (int i = 0; i < n; i++) {
			aarr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			barr[i] = sc.nextInt();
		}
		
		Arrays.sort(aarr);
		Arrays.sort(barr, Collections.reverseOrder());
		
		for (int i = 0; i < n; i++) {
			min += (aarr[i] * barr[i]);
		}
		System.out.println(min);
	}
}
