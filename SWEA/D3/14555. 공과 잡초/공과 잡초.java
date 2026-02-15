import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			String s = sc.next();
			char[] grass = s.toCharArray();
			int cnt = 0;
			
			for (int i = 0; i < grass.length; i++) { // 괄호 값 다 더해버려!
				if (grass[i] == '(' || grass[i] == ')') {
					cnt++;
				}
			}
			
			for (int i = 0; i < grass.length - 1; i++) { // 괄호 값 다 더해버려!
				if (grass[i] == '(' && grass[i + 1] == ')') {
					cnt--;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}
	}
}