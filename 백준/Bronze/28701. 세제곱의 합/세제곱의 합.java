
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int first = 0;
		int second = 0;
		int third = 0;

		for (int i = 1; i <= n; i++) {
			first += i;
		}
		
		second = first * first;
		
		for (int i = 1; i <= n; i++) {
			third = third + (i * i * i);
		}
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		
		
	}

}
