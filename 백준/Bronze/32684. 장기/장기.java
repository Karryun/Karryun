import java.util.*;

public class Main {
	static int[] score = { 13, 7, 5, 3, 3, 2 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cho = new int[6];
		int[] han = new int[6];
		int choSum = 0;
		double hanSum = 1.5;

		for (int i = 0; i < 6; i++) {
			cho[i] = sc.nextInt();
			choSum = choSum + (cho[i] * score[i]);
		}

		for (int i = 0; i < 6; i++) {
			han[i] = sc.nextInt();
			hanSum = hanSum + (han[i] * score[i]);
		}

		if (choSum > hanSum) {
			System.out.println("cocjr0208");
		} else {
			System.out.println("ekwoo");
		}

	}
}
