
import java.util.*;

public class Main {

	// 오른쪽 아래 왼쪽 위
	static int[] updown = { 0, 1, 0, -1 };
	static int[] side = { 1, 0, -1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int count = 0;
		int r = 0;
		int c = 0;
		int dir = 0;

		for (int i = 1; i <= n * m; i++) {

			arr[r][c] = i;

			int nr = r + updown[dir];
			int nc = c + side[dir];

			if (nr < 0 || nr >= n || nc < 0 || nc >= m || arr[nr][nc] != 0) {
				dir = (dir + 1) % 4;
				nr = r + updown[dir];
				nc = c + side[dir];
				count++;
			}
			r = nr;
			c = nc;

		}

		System.out.println(count - 1);

	}

}
