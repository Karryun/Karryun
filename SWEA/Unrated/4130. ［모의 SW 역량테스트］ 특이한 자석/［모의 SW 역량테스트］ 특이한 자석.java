import java.util.*;

public class Solution {
    // 우 좌
    static int[] side = { 1, -1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            int k = sc.nextInt(); // 회전 횟수
            // 각각 자석마다 list 생성
            ArrayList<Integer> mag1 = new ArrayList<>();
            ArrayList<Integer> mag2 = new ArrayList<>();
            ArrayList<Integer> mag3 = new ArrayList<>();
            ArrayList<Integer> mag4 = new ArrayList<>();
            int sum = 0;

            // 일일이 다 넣기
            for (int i = 0; i < 8; i++) {
                mag1.add(sc.nextInt());
            }

            for (int i = 0; i < 8; i++) {
                mag2.add(sc.nextInt());
            }

            for (int i = 0; i < 8; i++) {
                mag3.add(sc.nextInt());
            }

            for (int i = 0; i < 8; i++) {
                mag4.add(sc.nextInt());
            }

            // k번 회전할거니깐 반복문 생성
            for (int i = 0; i < k; i++) {
                int magnet = sc.nextInt() - 1; // 첫 시작점 (인덱스 0부터 시작이니 -1)
                int clock = sc.nextInt(); // 시계면 1, 반시계면 -1
                int[] clockArr = new int[4]; // 한 회전 당 움직일 방향을 담을 배열
                boolean[] isroll = new boolean[3]; // 극이 다른지 같은지
                clockArr[magnet] = clock;

                // 회전 전 자석들 사이의 접점 확인 (회전하면 값이 바뀌기 때문에 미리 체크)
                //변수 의미: meet[접점의 위치][자석의 위치]
                int meet11 = mag1.get(2);
                int meet12 = mag2.get(6);
                isroll[0] = (meet11 != meet12); // 다르면 true, 같으면 false 

                int meet22 = mag2.get(2);
                int meet23 = mag3.get(6);
                isroll[1] = (meet22 != meet23);

                int meet33 = mag3.get(2);
                int meet34 = mag4.get(6);
                isroll[2] = (meet33 != meet34);

                // 기준 자석으로부터 오른쪽으로 회전 전파
                for (int j = magnet; j < 3; j++) { // 어차피 3까지밖에 없으니깐
                    int nr = j + side[0];
                    // 극이 다르고 magnet(여기서는 j)이 회전을 할 때
                    if (isroll[j] && clockArr[j] != 0) { 
                    	// 기준 자석 마그넷이 1이면 -1, 아니면 1 (서로 반대여야지)
                        clockArr[nr] = (clockArr[j] == 1) ? -1 : 1;
                    } else {
                        break; // 한 번 안 돌아가면 그 뒤는 쭉 안 돌아감
                    }
                }

                // 기준 자석으로부터 왼쪽으로 회전 전파
                for (int j = magnet; j > 0; j--) {
                    int nr = j + side[1];
                    if (isroll[j - 1] && clockArr[j] != 0) {
                        clockArr[nr] = (clockArr[j] == 1) ? -1 : 1;
                    } else {
                        break; // 한 번 안 돌아가면 그 앞은 쭉 안 돌아감
                    }
                }

                // 결정된 방향에 따라 실제로 자석들 회전 시키기
                if (clockArr[0] == 1) { // 시계 방향으로 회전
                    mag1.add(0, mag1.remove(7)); // 마지막 값이 0번 인덱스로 와야 함.
                } else if (clockArr[0] == -1) { // 반시계 방향으로 회전
                    mag1.add(7, mag1.remove(0));  // 0번째 값이 마지막 값으로 가야 함.
                }

                if (clockArr[1] == 1) {
                    mag2.add(0, mag2.remove(7));
                } else if (clockArr[1] == -1) {
                    mag2.add(7, mag2.remove(0));
                }

                if (clockArr[2] == 1) {
                    mag3.add(0, mag3.remove(7));
                } else if (clockArr[2] == -1) {
                    mag3.add(7, mag3.remove(0));
                }

                if (clockArr[3] == 1) {
                    mag4.add(0, mag4.remove(7));
                } else if (clockArr[3] == -1) {
                    mag4.add(7, mag4.remove(0));
                }
            }

            // 점수 합계 계산
            sum = (mag1.get(0) * 1) + (mag2.get(0) * 2) + (mag3.get(0) * 4) + (mag4.get(0) * 8);
            System.out.println("#" + tc + " " + sum);
        }
    }
}