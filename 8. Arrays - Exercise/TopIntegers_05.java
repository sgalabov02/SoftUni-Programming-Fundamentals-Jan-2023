import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int counter = 0;
        int myJ = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(j > i) {
                    if(nums[i] > nums[j]) {
                        counter++;
                    }
                }
                myJ = j;
            }
            if(myJ - i == counter) {
                System.out.print(nums[i] + " ");
            }
            counter = 0;
        }
    }
}
