
public class VariableMutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		System.out.println(a + 10);
		
		int b = 100;
		System.out.println(b - 7); 
		
		int c = 44;
		System.out.println(c * 2);
		
		int d = 125;
		System.out.println(d / 5);
		
		int e = 8;
		int cubed = e * e * e;
		System.out.println(cubed);
		
		int f1 = 123;
		int f2 = 345;
		boolean aa = f1 > f2;
		System.out.println(aa);
		
		int g1 = 350;
		int g2 = 200;
		boolean gg = g2 > g1;
		System.out.println(gg);
		
		int h = 135798745;
		boolean isDivisible = h % 11 == 0;
		System.out.println(isDivisible);
		
		int i1 = 10;
		int i2 = 3;
		int i1Squared = i1 * i1;
		int i2Cubed = i2 * i2 * i2;
		boolean isHigher = i1 > i1Squared & i1 < i2Cubed;
		System.out.println(isHigher);
		
		int j = 1521;
		boolean divided3 = j % 3 == 0;
		boolean divided5 = j % 5 == 0; 
		boolean result = divided3 | divided5;
		System.out.println(result);
		
		
		
		
	}
	

}
