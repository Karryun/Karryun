import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			if (i % 2 != 0) {
				System.out.print("*");
				for (int j = 0; j < n - 1; j++) {
					System.out.print(" ");
					System.out.print("*");
				}
			} else {
				System.out.print(" ");
				for (int j = 0; j < n; j++) {
					System.out.print("*");
					System.out.print(" ");
				}
				
			}
				
				System.out.println();
			
			
		}
			
		
		}

	}

