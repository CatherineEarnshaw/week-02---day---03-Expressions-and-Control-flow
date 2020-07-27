import java.util.Scanner;
public class PrintBigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please write two numbers");
		Scanner scanner = new Scanner(System.in);
		int userInput1 = scanner.nextInt();
		int userInput2 = scanner.nextInt();
		
		if (userInput1 > userInput2) {
			System.out.println("Bigger number is " + userInput1);
			
		}
		else if (userInput2 > userInput1) {
			System.out.println("Bigger number is " + userInput2);
		}
	}

}
