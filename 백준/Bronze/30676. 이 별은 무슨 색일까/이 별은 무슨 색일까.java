import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "";
		int n = sc.nextInt();
		
		if (n >= 620 && n <= 780) ans = "Red";
		if (n >= 590 && n < 620) ans = "Orange";
		if (n >= 570 && n < 590) ans = "Yellow";
		if (n >= 495 && n < 570) ans = "Green";
		if (n >= 450 && n < 495) ans = "Blue";
		if (n >= 425 && n < 450) ans = "Indigo";
		if (n >= 380 && n < 425) ans = "Violet";
		
		System.out.println(ans);
	}
}