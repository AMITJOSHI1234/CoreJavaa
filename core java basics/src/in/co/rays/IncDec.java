package in.co.rays;

public class IncDec {
   public static void main(String args[]) {
	   int run = 105;
	   double strikerate1 = 125;
	   double strikerate2 = 225;
	   System.out.println("Select your batsman!!!");
	   System.out.println("1.Virat Kohli");
	   System.out.println("2.SuryaKumar Yadav");
	   int select = 2;
	   
	   switch(select) {
	   case 1 : {
		   if(run > 99)
		   {
			   System.out.println("Current run of Virat kohli is:"+run);
			    strikerate1=strikerate1+50;
			   System.out.println("Current Strikerate is :"+strikerate1);
		   } else {
			   System.out.println("Current run of Virat kohli is:"+run);
			   --strikerate1;
			   System.out.println("Current Strikerate is :"+strikerate1);
		   }
		   break;
	   }
	   case 2 : {
		   if(run > 99) {
			   System.out.println("Current run of SKY is:"+run);
			   strikerate2=strikerate2+100;
			   System.out.println("Current strikerate is :"+strikerate2);
		   } else {
			   System.out.println("Current run of SKY is:"+run);
			   --strikerate2;
			   System.out.println("Current strikerate is :"+strikerate2);
		   }
		   break;
	   }
	   default: 
		   System.out.println("Invalid choice");
	   }
   }
}
