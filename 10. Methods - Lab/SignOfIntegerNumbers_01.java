import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());

        signOfNum(num1);
    }

    public static void signOfNum(int num1) {
        if(num1 > 0) {
            System.out.println("The number " + num1 + " is positive.");
        }
        else if(num1 == 0) {
            System.out.println("The number " + num1 + " is zero.");
        }
        else {
            System.out.println("The number " + num1 + " is negative.");
        }
    }
}
