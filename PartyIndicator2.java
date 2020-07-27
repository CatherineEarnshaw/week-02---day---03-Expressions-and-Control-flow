import java.util.Scanner;
public class PartyIndicator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many boys are are there at the party?");	
		Scanner scanner = new Scanner(System.in);
		int boys = scanner.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("How many girls are are there at the party?");
		int girls = scanner2.nextInt();
		
		if (girls == boys && boys + girls >= 20) {
			System.out.println("The party is excellent.");
		}
		else if (girls != boys && boys + girls >= 20) {
			System.out.println("Quite cool party!");	
		}
		else if ((girls + boys) > 20) {
			System.out.println("Average party...");	
		}
		else if (girls <= 1 && boys > 5) {
			System.out.println("Sausage party!");
		}
		else   {
			System.out.println("Welcome to the party!");
		}
	
			
	}

}
