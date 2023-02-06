import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int length = 1;
        int index = 0;

        int maxLength = 0;
        int maxIndex = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                length++;
            } else {
                length = 1;
                index = i;
            }

            if(length > maxLength) {
                maxLength = length;
                maxIndex = index;
            }
        }
        for(int i = maxIndex; i < maxLength + maxIndex; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
