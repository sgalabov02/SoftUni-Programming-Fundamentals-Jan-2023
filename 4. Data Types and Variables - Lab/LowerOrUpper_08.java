import java.math.BigDecimal;
import java.util.Scanner;

public class LowerOrUpper_08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char a = scanner.next().charAt(0);
		if(Character.isUpperCase(a) == true) {
			System.out.println("upper-case");
		}
		else {
			System.out.println("lower-case");
		}
	}

}
