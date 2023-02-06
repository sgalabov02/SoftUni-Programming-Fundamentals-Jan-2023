import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int sum = 0;
        while(startingYield >= 100) {
            int yield = startingYield - 26;
            sum += yield;
            counter++;
            startingYield -= 10;
        }
        if(sum >= 26) {
            sum -= 26;
        }
        System.out.println(counter);
        System.out.println(sum);
    }
}
