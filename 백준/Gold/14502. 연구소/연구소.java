import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	static int n;
	static int m;
	static int max;
	static int[][] arr;

	// 상 하 좌 우
	static int[] updown = { -1, 1, 0, 0 };
	static int[] side = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		max = Integer.MIN_VALUE;

		wall(0);

		System.out.println(max);
	}

	private static void wall(int cnt) {
		if (cnt == 3) {

			// 맵 복사하기
			int[][] map = new int[n][m];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					map[i][j] = arr[i][j];
				}
			}
			virus(map);
			return;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0) { // 벽을 설치할 수 있다면
					arr[i][j] = 1; // 벽(1)을 설치하기
					wall(cnt + 1);
					arr[i][j] = 0;
				}
			}
		}
	}

	private static void virus(int[][] map) {

		ArrayDeque<int[]> queue = new ArrayDeque<>(); // 바이러스를 담을 배열
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 2) queue.offer(new int[] {i, j}); 
			}
		}
		
		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int row = cur[0]; 
			int col = cur[1];
			
			for (int i = 0; i < 4; i++) {
				int nr = row + updown[i];
				int nc = col + side[i];
				
				if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
				
				if (map[nr][nc] == 0) {
					map[nr][nc] = 2;
					queue.add(new int[] {nr, nc});
				}		
			}
		}
		
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 0) cnt++; 
			}
		}
		max = Math.max(max, cnt);
	}
}