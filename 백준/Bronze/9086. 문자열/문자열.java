import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			arr[i] = s;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].charAt(0) + "" + arr[i].charAt(arr[i].length() - 1));
		}
		
	}

}
