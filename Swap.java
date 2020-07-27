
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123;
		int b = 526;
		System.out.println("The numbers before swapping are: " + a +  " and " + b);
		
		a = a + b; // a=123 + 526= 649
		b = a - b; // b=649-526=123
		a = a - b; // a=649-123=526
		
		System.out.println("After swap a = " + a + " and b = " + b);
		
	}

}
