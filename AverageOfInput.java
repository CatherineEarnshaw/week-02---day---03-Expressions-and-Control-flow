import java.util.Scanner;

public class AverageOfInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please give me five numbers.");
		Scanner scanner = new Scanner (System.in);
		int userInput1 = scanner.nextInt();
		int userInput2 = scanner.nextInt();
		int userInput3 = scanner.nextInt();
		int userInput4 = scanner.nextInt();
		int userInput5 = scanner.nextInt();
				
		int sum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
		System.out.println("The total sum of your numbers is " + sum + ".");
		
	    int average = sum / 5;
	    System.out.println("The average of your numbers is " + average + ".");
				
	}

}
