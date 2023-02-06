import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];


        for(int i = 0; i < n; i++) {
            int[] tempArr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            if(i % 2 == 0) {
                firstArr[i] = tempArr[0];
                secondArr[i] = tempArr[1];
            } else {
                secondArr[i] = tempArr[0];
                firstArr[i] = tempArr[1];
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(firstArr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < n; i++) {
            System.out.print(secondArr[i] + " ");
        }
    }
}
