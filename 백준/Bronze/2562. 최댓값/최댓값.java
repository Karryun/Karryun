import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int max = Integer.MIN_VALUE;
		int idx = 0;
		
		for (int i = 1; i <= 9; i++) {
			int n = sc.nextInt();
			if (max < n) {
				max = n;
				idx = i;
			}	
		}
		System.out.println(max);
		System.out.println(idx);
	}
}