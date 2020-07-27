import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Whats your name?");
		Scanner scanner = new Scanner (System.in);
		String userInput = scanner.nextLine();
		System.out.println("Hello " + userInput);
	}
}

