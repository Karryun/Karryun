import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n+1]; // 구간합
		int sum = 0;
		arr[0] = 0;
		int[] ansarr = new int[m];
		
		for (int i = 1; i < arr.length; i++) {
			int tar = sc.nextInt();
			sum += tar;
			arr[i] = sum;
		}	
		
		for (int i = 0; i < m; i++) {
			int iNum = sc.nextInt();
			int jNum = sc.nextInt();
			
			ansarr[i] = arr[jNum] - arr[iNum-1];
		}
		
		for (int i = 0; i < m; i++) {
			System.out.println(ansarr[i]);
		}
	}
}
