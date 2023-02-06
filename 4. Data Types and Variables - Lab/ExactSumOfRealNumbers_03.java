import java.util.Scanner;
import java.math.BigDecimal;

public class ExactSumOfRealNumbers_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		BigDecimal sum = new BigDecimal("0");
		for(int i = 0; i < n; i++) {
			BigDecimal bd1 = new BigDecimal(scanner.nextLine());
			sum = sum.add(bd1);
		}
		System.out.println(sum);
	}
}
