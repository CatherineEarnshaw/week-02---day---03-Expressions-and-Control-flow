import java.util.Scanner;

public class AnimalsAndLegs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many chickens there are?");
		
		Scanner scanner = new Scanner (System.in);
		
		int userInputChicken = scanner.nextInt();
		
		System.out.println("How many pigs there are?");
		
		int userInputPigs = scanner.nextInt();
		
		int chickenLegs = userInputChicken * 2;
		int pigLegs = userInputPigs * 4;
		int result = chickenLegs + pigLegs;
		
		System.out.println("All together there are " + result + " legs at the farm.");
				
				
	}

}
