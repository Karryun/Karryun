import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5]; // 1, 2, 3, 4, 축
        
        for (int i = 0; i < n; i++) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	
        	if (x == 0 || y == 0) arr[4]++;
        	else if (x > 0 && y > 0) arr[0]++;
        	else if (x < 0 && y > 0) arr[1]++;
        	else if (x < 0 && y < 0) arr[2]++;
        	else if (x > 0 && y < 0) arr[3]++;
        }
        
        System.out.println("Q1:" + " " + arr[0]);
        System.out.println("Q2:" + " " + arr[1]);
        System.out.println("Q3:" + " " + arr[2]);
        System.out.println("Q4:" + " " + arr[3]);
        System.out.println("AXIS:" + " " + arr[4]);
        
        
    }
}