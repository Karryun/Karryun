import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.next().split("/");
		
		int k = Integer.parseInt(arr[0]);
		int d = Integer.parseInt(arr[1]);
		int a = Integer.parseInt(arr[2]);
		
		if (k + a < d || d == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}
}