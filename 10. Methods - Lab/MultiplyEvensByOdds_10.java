import java.text.DecimalFormat;
import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(oddAndEvenSum(num));

    }

    public static int oddAndEvenSum(int num) {
        int oddSum = 0;
        int evenSum = 0;
        num = Math.abs(num);
        while(num > 0) {
            int lastDigit = num % 10;
            if(lastDigit % 2 == 0) {
                evenSum += lastDigit;
            }
            else {
                oddSum += lastDigit;
            }
            num /= 10;
        }
        return oddSum * evenSum;
    }

}
