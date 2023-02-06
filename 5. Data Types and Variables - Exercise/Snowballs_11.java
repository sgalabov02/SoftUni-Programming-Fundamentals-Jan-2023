import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int thrownSnowballs = Integer.parseInt(scanner.nextLine());

        double maxSnowballValue = Double.MIN_VALUE;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        double maxSnowballQuality = 0;
        for(int i = 0; i < thrownSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            int temp = snowballSnow / snowballTime;
            double snowballValue = Math.pow(temp, snowballQuality);
            if(snowballValue > maxSnowballValue) {
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
                maxSnowballValue = snowballValue;
            }
        }
        System.out.printf("%d : %d = %.0f (%.0f)", maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality);
    }
}
