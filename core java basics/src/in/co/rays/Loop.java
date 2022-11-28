package in.co.rays;

public class Loop {
  public static void main(String[] args) {
	  //for(int i = 1 ; i<=5 ;i++) {
		//	System.out.println(i);
		//}
	  //reverse for loop
	//  for(int i = 5 ; i>0 ;i--) {
		//	System.out.println(i);
	//	}
	 
	  //pre increment
	  //for(int i = 1 ; i<=5 ;++i) {
		//	System.out.println(i);
		//}
	  
	  //predecrement
	  /*for(int i = 5 ; i>0 ;--i) {
			System.out.println(i);
		}*/
	  
	  for(int i=3; i<5;i++)
	  {
		  for(int j=1;j<=i;j++) {
			  System.out.print( '*' );
		  }
		  System.out.println(" $");
	  }
	 }
}
