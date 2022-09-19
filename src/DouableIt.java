import java.util.Scanner;

public class DouableIt {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Insert the number");

			double number = Double.parseDouble(scan.nextLine());
			System.out.println("Doubled number =" + doubleNumber(number));
		}
	}
	
	public static float doubleNumber(double number) {
	    number *= 2;
		return (float) number;
	}

}
