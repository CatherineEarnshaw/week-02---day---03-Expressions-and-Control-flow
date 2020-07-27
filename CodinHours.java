
public class CodinHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int perWeek = 5 * 6;
		System.out.println("Student studies " + perWeek + " hours per week.");
		int perSemester = perWeek * 17;
		System.out.println("So during the whole semester he studies " + perSemester + " hours.");
		
		int averageHoursW = 52;
		
		System.out.println("The average percentage of hours during the term is " + (float) perWeek / averageHoursW * 100 +  " %.");
		
	}

}
