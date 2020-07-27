
public class SecondsInADay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	
	int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    
    int second = 60 - currentSeconds;
    int min = 60 - currentMinutes;
    int hour = 24 - 14;
    
    System.out.println(second);
    System.out.println(min);
    System.out.println(hour);
    
    int secInHour = 10 * 3600;
    int secMin = 26 * 60;
    int sec = 18;
    int result = secInHour + secMin + sec;
    
    System.out.println("According to the current time 14:34:42, the remaining number of seconds in this day is: " + result + " seconds.");
	}

	}


