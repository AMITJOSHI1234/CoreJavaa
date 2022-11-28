package in.co.rays;

public class Minor {
   public static void main(String args[])
   {
	    int run=100;
	    int strikerate = 200;
	    
	    if(run >99) {
	    	++strikerate;
	    	System.out.println("Your strikerate is:"+strikerate);
	    } else {
	    	--strikerate;
	    	System.out.println("Your strikerate is:"+strikerate);
	    }
   }
}
