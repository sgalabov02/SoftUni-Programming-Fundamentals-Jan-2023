import java.util.Scanner;

public class DecryptingMessages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String message = "";
        for(int i = 0; i < n; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            currentChar += key;
            message += currentChar;
        }
        System.out.println(message);
    }
}
