package in.co.rays;

public class Increment1 {
public static void main(String args[]) {
	//pre increment
	int a =10;
	System.out.println("Value of a before pre increment:"+a);
	System.out.println("Value of a after pre increment:"+(++a));
	
	//post increment
	int b= 50;
	System.out.println("Value of b before post increment:"+b);
	System.out.println("Value of b after post increment"+b++);
	System.out.println("Now value of b "+b);
	
	//pre decrement
	int c = 60;
	System.out.println("Value of a before pre decrement:"+c);
	System.out.println("Value of a after pre increment:"+(--c));
	
	//post decrement
    int d = 80;
    System.out.println("Value of d before post increment:"+d);
	System.out.println("Value of d after post increment"+d--);
	System.out.println("Now value of d "+d);
    
}  
}
