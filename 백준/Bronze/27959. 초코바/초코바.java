import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String ans = "No";
		
		int money = n * 100;
		
		if (money >= m) ans = "Yes";
		
		System.out.println(ans);
	}
}