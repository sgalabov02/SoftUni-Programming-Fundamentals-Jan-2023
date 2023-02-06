import java.util.Scanner;

public class DayOfWeek_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = Integer.parseInt(scanner.nextLine());
		String a[] = {"Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturday", "Sunday"};
		
		if(choice >= 1 && choice <= 7) {
			System.out.println(a[choice-1]);
		}
		else {
			System.out.println("Invalid day!");
		}

	}

}
