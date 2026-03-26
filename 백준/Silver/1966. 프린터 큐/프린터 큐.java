import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc = 0; tc < t; tc++) {
			int n = sc.nextInt(); 
			int m = sc.nextInt(); // 몇 번째로 인쇄되는지 궁금한 문서의 순서를 표현
			Deque<int[]> q = new ArrayDeque<>();
			int cnt = 0;
			
			for (int i = 0; i < n; i++) {
				q.add(new int[] {i ,sc.nextInt()});
			}

			while(!q.isEmpty()) {
				int[] cur = q.poll();
				boolean isMax = true;
				
				for (int[] doc : q) {
					if (cur[1] < doc[1]) {
						isMax = false;
						break;
					}
				}
				
				if (!isMax) {
					q.add(cur);
				} else {
					cnt++;
					if (cur[0] == m) {
						System.out.println(cnt);
						break;
					}
				}
			}	
		}		
	}
}