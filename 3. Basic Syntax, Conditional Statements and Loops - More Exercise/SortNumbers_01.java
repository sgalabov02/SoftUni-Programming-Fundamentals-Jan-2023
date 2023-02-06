import java.util.Scanner;

public class SortNumbers_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = Double.parseDouble(scanner.nextLine());
		double b = Double.parseDouble(scanner.nextLine());
		double c = Double.parseDouble(scanner.nextLine());
		
		if(a > b && a > c) {
			if(b > c) {
				System.out.printf("%.0f\n%.0f\n%.0f", a, b, c);
			}
			else {
				System.out.printf("%.0f\n%.0f\n%.0f", a, c, b);
			}
		}
		else if(b > a && b > c) {
			if(a > c) {
				System.out.printf("%.0f\n%.0f\n%.0f", b, a, c);
			}
			else {
				System.out.printf("%.0f\n%.0f\n%.0f", b, c, a);
			}
		}
		else if(c > a && c > b) {
			if(b > a) {
				System.out.printf("%.0f\n%.0f\n%.0f", c, b, a);
			}
			else {
				System.out.printf("%.0f\n%.0f\n%.0f", c, a, b);
			}
		}
	}
}
