import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = "";

        while(!command.equals("end")) {
            if(command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int temp = nums[index1];
                nums[index1] = nums[index2];
                nums[index2] = temp;
            }
            else if(command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                nums[index1] = nums[index1] * nums[index2];
            }
            else if(command.equals("decrease")) {
                for(int i = 0; i < nums.length; i++) {
                    nums[i]--;
                }
            }
            command = scanner.nextLine();
        }

        for(int i = 0; i < nums.length; i++) {
            if(i == nums.length - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }

    }
}
