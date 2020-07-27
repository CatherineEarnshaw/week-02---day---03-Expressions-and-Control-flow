
public class ConditionalVariableMutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 24;
		int out = 0;
		if (a % 2 == 0) {
			System.out.println(++out);
		}
		
		
		
		int b = 13;
	    String out2 = "";
	    
	    if (b >= 10) {
	    	if (b <= 20) {
	    		System.out.println("Sweet");
	    	}
	    }
	    
	    else if (b < 10) {
	    	System.out.println("Less");
	    }
	    else if (b > 20) {
	    	System.out.println("More");
	    }
	    System.out.println(out2);
	    
	    
	    
	    int c = 123;
	    int credits = 100;
	    boolean isBonus = false;
	    
	    if (credits >= 50) {
	    	if (isBonus == false) {
	    	c-=2;
	    	    }
	    }
	   else if (credits < 50)	{
		    if (isBonus == false) {
			c--;   
		   }
	   }
	   else if (isBonus == true) {
		   c =c;
	   }
	    System.out.println(c);
	    
	    
	    
	    
	    int d = 8;
	    int time = 120;
	    String out3 = "";
	    
	    
	    if(d % 4 == 0) {
	    	if (time <= 200) {
	    		out3 = "check";
	    	}
	    	if (time > 200) {
	    		out3 = "Time out";
	    	}
	    }
	    else {
	    	out3 = "Run, Forest Run!";
	    }
	    System.out.println(out3);
	}
	}

