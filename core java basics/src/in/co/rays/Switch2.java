package in.co.rays;

public class Switch2 {
 public static void main(String args[]) {
	 System.out.println("              Hii Welcome to clothing store          ");
	 System.out.println("      Please select your shirt size!!!!");
	 System.out.println("1.Small");
	 System.out.println("2.Medium");
	 System.out.println("3.Large");
	 System.out.println("4.Xlarge");
	 System.out.println("5.XXl");
	 int size=1;
	 switch(size) {
	 case 1: {
		 System.out.println("   Okk your shirt size is small");
		 System.out.println(" We will send your shirt on your registered address ");
		 System.out.println("   Thanks for shopping with us");
		 break;
	 }
	 case 2: {
		 System.out.println("   Okk your shirt size is medium");
		 System.out.println(" We will send your shirt on your registered address ");
		 System.out.println("   Thanks for shopping with us");
		 break;
	 }
	 case 3:{
		 System.out.println("   Okk your shirt size is large");
		 System.out.println(" We will send your shirt on your registered address ");
		 System.out.println("   Thanks for shopping with us");
		 break;
	 }
	 case 4:{
		 System.out.println("   Okk your shirt size is Xlarge");
		 System.out.println(" We will send your shirt on your registered address ");
		 System.out.println("   Thanks for shopping with us");
		 break;
	 }
	 case 5:{
		 System.out.println("   Okk your shirt size is XXl");
		 System.out.println(" We will send your shirt on your registered address ");
		 System.out.println("   Thanks for shopping with us");
		 break;
	 }
	 default :
		 System.out.println("Invalid choice!!Please choose again");
	 }
 }
}
