import java.util.Scanner;

public class Login_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int counter = 0;

        for(int i = username.length() - 1; i >= 0; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
        }
        String pass = scanner.nextLine();
        while(!pass.equals(password)) {
            counter++;
            System.out.println("Incorrect password. Try again.");
            pass = scanner.nextLine();
            if(counter == 3 && !pass.equals(password)) {
                System.out.println("User " + username + " blocked!");
                return;
            }
        }
        System.out.println("User " + username + " logged in.");
    }

}
