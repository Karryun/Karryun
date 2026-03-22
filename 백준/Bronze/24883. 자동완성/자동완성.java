import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char alpha = sc.next().charAt(0);
		String ans = "Naver Whale";
		
		if (alpha == 'n' || alpha == 'N') ans = "Naver D2";
		
		System.out.println(ans);
	}
}