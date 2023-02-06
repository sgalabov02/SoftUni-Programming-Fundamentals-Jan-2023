import java.util.Scanner;

public class Orders_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = Integer.parseInt(scanner.nextLine());
		double sum = 0;
		
		for(int i = 0; i < N; i++) {
			double capsule = Double.parseDouble(scanner.nextLine());
			int days = Integer.parseInt(scanner.nextLine());
			int capsulesCount = Integer.parseInt(scanner.nextLine());
			double total = ((days * capsulesCount) * capsule);
			System.out.printf("The price for the coffee is: $%.2f\n", total);
			sum += total;
		}
		System.out.printf("Total: $%.2f", sum);
		
	}
}
