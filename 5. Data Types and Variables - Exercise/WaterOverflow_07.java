import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int litres = Integer.parseInt(scanner.nextLine());
            if(litres > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity -= litres;
                sum += litres;
            }
        }
        System.out.println(sum);
    }
}
