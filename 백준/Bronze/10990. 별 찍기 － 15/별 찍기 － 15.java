import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			

			if (i == 1) {
				System.out.print("*");
			} else {
				System.out.print("*");
				for (int k = 0; k < 2*i-3; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();	
		}
			
		
		}

	}

