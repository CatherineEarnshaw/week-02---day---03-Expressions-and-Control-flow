import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please give me number.");
		Scanner scanner = new Scanner (System.in);
		int cislo = scanner.nextInt();
		int naseCislo = 7;
	
		if (cislo > naseCislo) {
			System.out.println("The stored number is higher.");
		}
		else if (cislo < naseCislo) {
			System.out.println("The stored number is lower.");
		}
		else if (cislo == naseCislo) {
			System.out.println("You found the number 7!");
		}
	}			

}
