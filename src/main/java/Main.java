package recursiveHM;

public class Main {

	public static int q1(int n) {
		if (n==1) 
			return 1;
		return n+ q1(n-1);
	}


	public static int q2(int n) {
		if (n==1) 
			return 1;
		return n* q2(n-1);
	}

	public static int q3(int n) {

		if (n==1) {
			return 1;
		}
		if (n%2==0) { 
			return q3(n-1);
		}
		else {
			return n*q3(n-1);
		}

	}

	public static int q4(int n) {
		if (n==0) 
			return 0;
		return 1 + q4(n/10);
	}
	
	public static int q5(int numerator,int denominator) {
		
		if (numerator<denominator) 
			return 0;
		return 1 + q5(numerator-denominator,denominator);
	}
	
    public static int q6(int numerator,int denominator) {
		
		if (numerator<denominator) 
			return numerator;
		return q6(numerator-denominator,denominator);
	}
    
    public static boolean q7(int x,int y) {
		
		if (x<y) 
			if (x==0)
				return true;
			else
				return false;
		return q7(x-y,y);
	}
	
    
    public static boolean q8Helper(int num, int count) {
      
        if (num <= 1) {
            return false; 
        }
        if (count == 1) {
            return true;  
        }
        if (q7(num, count)) {
            return false; 
        }

        return q8Helper(num, count - 1);
    }

    public static boolean q8(int num) {
        return q8Helper(num, (int)Math.sqrt(num));
    }

	

    public static boolean q9Helper(int n,boolean isDigitEven) {
    	if (n>0)
    		if ((n%2 == 0)&&(isDigitEven==true)) 
    			return q9Helper(n/10,true);
    		else if ((n%2 == 1)&&(isDigitEven==false)) 
    	    	return q9Helper(n/10,false);
    	    else
    	    	return false;
    	    
        else
    	    return true;
	}
    
    public static boolean q9(int num) {
        if (num % 2 == 0)
        	return q9Helper(num/10,true);
        else
        	return q9Helper(num/10,false);

    }
    
    
    
    
	public static double e(int n) {
		if (n==0) 
			return 1.0;
		return 1.0/q2(n) + e(n-1);
	}




	}

