
public class Cuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 sides of a cuboid in cm
		int a = 16;
		int b = 29;
		int c = 10;
		
		int objem = a * b * c;
		System.out.println("Your cuboid has a volume of " + objem + " cm3.");
		
		int plocha = 2 * (a*b + a*c + b*c);
		System.out.println("Your cuboid has a surface area of " + plocha + " cm2.");
	}

}
