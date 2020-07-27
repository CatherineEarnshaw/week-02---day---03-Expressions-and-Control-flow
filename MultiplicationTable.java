import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please give me a number.");
		Scanner scanner = new Scanner (System.in);
		int cislo = scanner.nextInt();
		int nasobek;
		
		for (nasobek = 1;nasobek <=10; nasobek++) {
			System.out.println(cislo + " * " + nasobek + " = "+ cislo * nasobek);
		}
		
	}

}
