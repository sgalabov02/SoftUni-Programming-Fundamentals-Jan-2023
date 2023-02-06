import java.util.Arrays;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trains = Integer.parseInt(scanner.nextLine());
        int[] trainsArr = new int[trains];

        int sum = 0;
        for(int i = 0; i < trainsArr.length; i++) {
            trainsArr[i] = Integer.parseInt(scanner.nextLine());
            sum += trainsArr[i];
        }

        for(int i = 0; i < trainsArr.length; i++) {
            System.out.print(trainsArr[i] + " ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
