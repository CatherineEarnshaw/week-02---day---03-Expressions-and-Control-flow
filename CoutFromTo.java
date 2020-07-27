import java.util.Scanner;

public class CoutFromTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please give two numbers.");
		Scanner scanner = new Scanner(System.in);
		
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		
		if (second <= first) {
			System.out.println("The second number should be bigger.");
		}
		else if (second > first) {
			int i = second;
			int b = first;
			for (b = first; b<= i; b++) {
				System.out.println(b);
			}
		}
	}

}
