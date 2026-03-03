import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    // 상 하 좌 우
    static int[] updown = { -1, 1, 0, 0 };
    static int[] side = { 0, 0, -1, 1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] { 0, 0 });
        visited[0][0] = true;

        while (!queue.isEmpty()) {
    
            int[] cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                
                int nr = cur[0] + updown[i];
                int nc = cur[1] + side[i];

                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                
                if (!visited[nr][nc] && arr[nr][nc] == 1) {
                    visited[nr][nc] = true;
                    queue.add(new int[] {nr, nc});
                    arr[nr][nc] = arr[cur[0]][cur[1]] + 1;
                }
                if (nr == n - 1 && nc == m - 1) break;
            }
        }
        System.out.println(arr[n-1][m-1]);
    }
}