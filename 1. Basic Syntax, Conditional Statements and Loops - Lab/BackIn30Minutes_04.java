import java.util.Scanner;

public class BackIn30Minutes_04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hours = Integer.parseInt(scanner.nextLine());
		int minutes = Integer.parseInt(scanner.nextLine());
		
		int totalTime = (hours * 60) + minutes + 30;
		
		hours = totalTime / 60;
		minutes = totalTime % 60;
		
		if(hours > 23) {
			hours = 0;
		}
		System.out.printf("%d:%02d", hours, minutes);
		
	}

}
