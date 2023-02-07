import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", calculateRectangleArea(num1, num2));
    }

    public static double calculateRectangleArea(double num1, double num2) {
        return num1 * num2;
    }
}
