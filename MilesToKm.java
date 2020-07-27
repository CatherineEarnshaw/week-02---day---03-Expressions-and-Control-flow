import java.util.Scanner;

public class MilesToKm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner (System.in);	
	System.out.println("Tell me the distance in miles please.");
	double inputMiles = scanner.nextDouble();
	
	double mileToKm = inputMiles * 1.61;
	System.out.println("The distance in kilometers is " + mileToKm + ".");
	}

}
