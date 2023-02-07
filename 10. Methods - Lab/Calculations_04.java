import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        
        printResult(command, num1, num2);


    }

    public static void printResult(String command, int num1, int num2) {
        switch(command) {
            case "add":
                System.out.println(num1 + num2);
                break;
            case "multiply":
                System.out.println(num1 * num2);
                break;
            case "subtract":
                System.out.println(num1 - num2);
                break;
            case "divide":
                System.out.println(num1 / num2);
                break;
        }
    }
}
