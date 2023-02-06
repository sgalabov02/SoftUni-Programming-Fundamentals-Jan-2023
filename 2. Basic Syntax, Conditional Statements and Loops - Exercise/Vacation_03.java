import java.util.Scanner;
public class Vacation_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numPeople = Integer.parseInt(scanner.nextLine());
		String people = scanner.nextLine();
		String day = scanner.nextLine();
		double price = 0;
		double total_price = 0;
		
		if(people.equals("Students")) {
			if(day.equals("Friday")) {
				total_price = 8.45 * numPeople;
			}
			else if(day.equals("Saturday")) {
				total_price = 9.80 * numPeople;
			}
			else if(day.equals("Sunday")) {
				total_price = 10.46 * numPeople;
			}
			if(numPeople >= 30) {
				total_price -= total_price * 15 / 100;
			}
		}
		else if(people.equals("Business")) {
			if(day.equals("Friday")) {
				price = 10.90;
				total_price = 10.90 * numPeople;
			}
			else if(day.equals("Saturday")) {
				price = 15.60;
				total_price = 15.60 * numPeople;
			}
			else if(day.equals("Sunday")) {
				price = 16;
				total_price = 16 * numPeople;
			}
			if(numPeople >= 100) {
				total_price = 0;
				numPeople -= 10;
				total_price = numPeople * price;
			}
		}
		else if(people.equals("Regular")) {
			if(day.equals("Friday")) {
				total_price = 15 * numPeople;
			}
			else if(day.equals("Saturday")) {
				total_price = 20 * numPeople;
			}
			else if(day.equals("Sunday")) {
				total_price = 22.50 * numPeople;
			}
			if(numPeople >= 10 && numPeople <= 20) {
				total_price -= total_price * 5 / 100;
			}
		}
		
		System.out.printf("Total price: %.2f", total_price);
	}

}
