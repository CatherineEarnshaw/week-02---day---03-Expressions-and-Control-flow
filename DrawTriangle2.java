import java.util.Scanner; 

public class DrawTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("write a number");
		int numberInput = scanner.nextInt();
		int a = numberInput;
		int b;
		
		for (a = 0; a <= numberInput; a++ ) {
			
			for (b = 0; b < a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
