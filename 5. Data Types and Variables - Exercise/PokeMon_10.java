import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int startingPower = pokePower;
        int counter = 0;
        while(pokePower >= distance) {
            pokePower -= distance;
            counter++;
            if(pokePower == startingPower / 2 && exhaustionFactor != 0) {
                pokePower /= exhaustionFactor;
            }
        }

        System.out.println(pokePower);
        System.out.println(counter);
    }
}
