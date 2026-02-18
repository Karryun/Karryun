import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[101][101];
		int cnt = 0;
		
		for (int t = 0; t < n; t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int i = x; i < x + 10; i++) {
				for (int j = y; j < y + 10; j++) {
					arr[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 1) cnt++;
			}
		}
		System.out.println(cnt);
	}
}