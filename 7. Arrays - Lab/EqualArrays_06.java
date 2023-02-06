import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] nums2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for(int i = 0; i < nums1.length; i++) {
            if(nums1[i] != nums2[i]) {
                System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                return;
            }
            sum += nums1[i];
        }

        System.out.println("Arrays are identical. Sum: " + sum);

    }
}
