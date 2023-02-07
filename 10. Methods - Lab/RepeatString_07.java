import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(text, n));
    }

    public static String repeatString(String text, int n) {
        String updatedText = "";
        for(int i = 0; i < n; i++) {
            updatedText += text;
        }
        return updatedText;
    }
}
