import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String ans = "Time limit exceeded";
		
		if ((n * n) <= 100000000L) ans = "Accepted";
		
		System.out.println(ans);
	}
}