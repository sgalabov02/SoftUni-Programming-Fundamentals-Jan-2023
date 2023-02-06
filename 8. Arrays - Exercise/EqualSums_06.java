import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    if(j < i) {
                        leftSum += nums[j];
                    }
                    else {
                        rightSum += nums[j];
                    }
                }
            }
            if(leftSum == rightSum) {
                System.out.println(i);
                return;
            }
            leftSum = 0;
            rightSum = 0;
        }
        System.out.println("no");
    }
}
