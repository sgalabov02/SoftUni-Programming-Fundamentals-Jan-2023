import java.math.BigDecimal;
import java.util.Scanner;

public class RefactorVolumeOfPyramid_11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Length: ");
		double length = Double.parseDouble(scanner.nextLine());
		System.out.print("Width: ");
		double width = Double.parseDouble(scanner.nextLine());
		System.out.print("Height: ");
		double volume = Double.parseDouble(scanner.nextLine());
		double pyrVolume = (length * width * volume) / 3;
		System.out.printf("Pyramid Volume: %.2f", pyrVolume);

	}

}
