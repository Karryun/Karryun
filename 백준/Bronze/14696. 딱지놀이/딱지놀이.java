import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] ansarr = new char[n];
		int idx = 0;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int[] aarr = new int[a];
			int[] cntAarr = new int[5]; // 1~4까지 담기 위해서
			for (int j = 0; j < a; j++) {
				aarr[j] = sc.nextInt();
				cntAarr[aarr[j]]++;
			}
			
			int b = sc.nextInt();
			int[] barr = new int[b];
			int[] cntBarr = new int[5];
			for (int j = 0; j < b; j++) {
				barr[j] = sc.nextInt();
				cntBarr[barr[j]]++;
			}
			
			boolean draw = true;
			for (int j = 4; j >= 1; j--) {
				if (cntAarr[j] > cntBarr[j]) {
					ansarr[idx] = 'A';
					draw = false;
					break;
				} else if (cntAarr[j] < cntBarr[j]) {
					ansarr[idx] = 'B';
					draw = false;
					break;
				}
			}
			if (draw) ansarr[idx] = 'D';
			idx++;
		}
		for (int i = 0; i < ansarr.length; i++) {
			System.out.println(ansarr[i]);
		}
	}
}