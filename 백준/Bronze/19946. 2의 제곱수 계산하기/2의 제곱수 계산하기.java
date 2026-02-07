import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		BigInteger bnum = new BigInteger(num);
		BigInteger zero = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		
		int count = 64;
		while (bnum.mod(two).equals(zero)) {
			bnum = bnum.divide(two);
			count--;
		}
		
		System.out.println(count);
		
		
		
	}

}
