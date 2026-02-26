import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		String[] arr = s.split(" ");
		
		if (arr[0] == "") System.out.println(0);
		else System.out.println(arr.length);
	}
}
