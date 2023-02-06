import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i;
		int n = Integer.parseInt(scanner.nextLine());
		int multiplier = Integer.parseInt(scanner.nextLine());
		
		for(i = multiplier; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", n, i, n*i);
		}
		
		if(multiplier > 10) {
			System.out.printf("%d X %d = %d\n", n, i, n*i);
		}
	}
}
