import java.util.Scanner;

public class RageExpenses_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int lostGames = Integer.parseInt(scanner.nextLine());
		double headsetPrice = Double.parseDouble(scanner.nextLine());
		double mousePrice = Double.parseDouble(scanner.nextLine());
		double keyboardPrice = Double.parseDouble(scanner.nextLine());
		double displayPrice = Double.parseDouble(scanner.nextLine());
		
		int brokenHeadsets = lostGames / 2;
		int brokenMouses = lostGames / 3;
		int brokenKeyboards = lostGames / 6;
		int brokenDisplays = lostGames / 12;
		double total = headsetPrice * brokenHeadsets + mousePrice * brokenMouses
				+ keyboardPrice * brokenKeyboards + displayPrice * brokenDisplays;
		
		System.out.printf("Rage expenses: %.2f lv.", total);
	}
}
