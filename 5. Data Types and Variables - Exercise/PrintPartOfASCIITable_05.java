import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int charNum1 = Integer.parseInt(scanner.nextLine());
        int charNum2 = Integer.parseInt(scanner.nextLine());

        for(int i = charNum1; i <= charNum2; i++) {
            char currentSymbol = (char) i;
            System.out.print(currentSymbol + " ");
        }
    }
}
