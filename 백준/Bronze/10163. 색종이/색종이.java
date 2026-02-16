import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[1001][1001];
		
		for (int i = 1; i <= n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int width  = sc.nextInt();
			int height = sc.nextInt();
			
			for (int j = x; j < x + width; j++) {
				for (int k = y; k < y + height; k++) {
					arr[j][k] = i;
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[0].length; k++) {
					if (arr[j][k] == i) sum++;
				}
			}
			System.out.println(sum);
		}
	}
}
