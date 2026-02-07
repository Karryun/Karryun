import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String base = sc.nextLine().trim();
		String search = sc.nextLine().trim();

		int count = 0;
		for (int i = 0; i < base.length() - search.length() + 1; i++) {
			if (base.startsWith(search, i)) {
				count++;
				i += search.length() - 1;
			}

		}
		
		System.out.println(count);
	}

}
