import java.util.Scanner;

public class xdddzs {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String message = scanner.nextLine();
		String message2 = "";
		
		for(int i = message.length() - 1; i >= 0; i--) {
			char myChar = message.charAt(i);
			message2 += myChar;
		}
		System.out.println(message2);
		
	}

}
