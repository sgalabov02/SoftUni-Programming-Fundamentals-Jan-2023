import java.util.Scanner;

public class ConvertMetersToKilometers_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int metres = Integer.parseInt(scanner.nextLine());
		double km = metres * 0.001;
		System.out.printf("%.2f", km);
	}

}
