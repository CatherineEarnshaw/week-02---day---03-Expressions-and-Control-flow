import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a number");
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		
		if (userInput / 2 == 0) {
			System.out.println("Bingo! Its an EVEN number");
		} 
		else if (userInput / 2 != 0) {
			System.out.println("Bingo! Its an ODD number");
		}
		
		
		
		}
	
	
}
