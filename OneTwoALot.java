import java.util.Scanner;
public class OneTwoALot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write a number");
		int userInput  = scanner.nextInt();
		
		if (userInput <= 0 ) {
			System.out.println(" Its a 0");
		}
		else if (userInput == 1) {
			System.out.println("Its One");
		}
		else if (userInput == 2) {
			System.out.println("Its Two");
		}
		else {
			System.out.println("A lot");
		}
	}

}
