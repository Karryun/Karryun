import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int han = a + c;
		int yong = b + d;

		if (han < yong) {
			System.out.println("Hanyang Univ.");
		} else if (han > yong) {
			System.out.println("Yongdap");
		} else {
			System.out.println("Either");
		}

	}
}
