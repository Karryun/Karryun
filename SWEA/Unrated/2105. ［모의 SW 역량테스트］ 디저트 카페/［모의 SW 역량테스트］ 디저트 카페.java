import java.util.Scanner;

public class Solution {

    // 우상, 우하, 좌하, 좌상
    static int[] updown = { -1, 1, 1, -1 };
    static int[] side = { 1, 1, -1, -1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            int max = -1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 1; i <= n - 2; i++) { // 가능한 행의 수 (왼쪽 꼭짓점 기준)
                for (int j = 0; j <= n - 3; j++) { // 가능한 열의 수
                    for (int a = 1; a <= i; a++) { // 우상으로 가는 변 길이
                        for (int b = 1; b <= n - 1 - i; b++) { // 우하로 가는 변 길이
                            
                            boolean[] ate = new boolean[101]; 
                            int row = i;
                            int col = j;
                            boolean canFour = true;
                            int count = 1;

                            ate[arr[row][col]] = true;

                            int[] lengths = {a, b, a, b - 1}; 

                            // 4방향을 순서대로 탐색
                            for (int dir = 0; dir < 4; dir++) {
                                for (int step = 0; step < lengths[dir]; step++) {
                                    row += updown[dir];
                                    col += side[dir];

                                    if (row < 0 || row >= n || col < 0 || col >= n || ate[arr[row][col]]) {
                                        canFour = false;
                                        break;
                                    }

                                    ate[arr[row][col]] = true; // 디저트 먹음 처리
                                    count++;
                                }
                                if (!canFour) break;
                            }

                            if (canFour) {
                                max = Math.max(max, count);
                            }
                        }
                    }
                }
            }
            System.out.println("#" + tc + " " + max);
        }
    }
}