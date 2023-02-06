import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int a[] = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			int currentNum = Integer.parseInt(scanner.nextLine());
			a[i] = currentNum;
		}
		
		for(int i = n-1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
