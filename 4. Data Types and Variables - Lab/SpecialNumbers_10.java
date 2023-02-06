import java.util.Scanner;

public class SpecialNumbers_10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nums = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		for (int i = 1; i <= nums; i++) {
		    int temp = i;
		    while (i > 0) {
		        sum += i % 10;
		        i = i / 10;
		    }
		    if(sum == 5 || sum == 7 || sum == 11) {
		    	System.out.printf("%d -> True\n", temp);
		    } else {
		    	System.out.printf("%d -> False\n", temp);
		    }
		    sum = 0;
		    i = temp;
		}
	}

}
