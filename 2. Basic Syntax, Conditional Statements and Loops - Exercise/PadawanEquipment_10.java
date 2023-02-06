import java.util.Scanner;

public class PadawanEquipment_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double money = Double.parseDouble(scanner.nextLine());
		int students = Integer.parseInt(scanner.nextLine());
		double lightsabers = Double.parseDouble(scanner.nextLine());
		double robes = Double.parseDouble(scanner.nextLine());
		double belts = Double.parseDouble(scanner.nextLine());
		double freeBelts = students / 6;
		double total = lightsabers * Math.ceil(students + students * 0.10) + robes * students
				+ belts * (students - freeBelts);
		double difference = total - money;
		if(total <= money) {
			System.out.printf("The money is enough - it would cost %.2flv.", total);
		}
		else {
			System.out.printf("George Lucas will need %.2flv more.", difference);
		}
	}
}
