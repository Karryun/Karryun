import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arr = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
			}
		
		for (int i = 0; i < arr.length; i++){
			if (Character.isUpperCase(arr[i])) {
				arr[i] = Character.toLowerCase(arr[i]); 
			} else {
				arr[i] = Character.toUpperCase(arr[i]); 
			}
		}		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		
	}

}
