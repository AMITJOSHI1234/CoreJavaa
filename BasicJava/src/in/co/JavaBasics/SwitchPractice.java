package in.co.JavaBasics;

public class SwitchPractice {
public static void main(String[] args) {
	String month = "June";
	
	switch(month) {
	case "Jan" :{
		System.out.println("This month is jan");
		break;
	}
	case "Feb" :{
		System.out.println("This month is Feb");
		break;
	}
	
	case "Mar":{
		System.out.println("This month is march");
		break;
	}
	case "April" :{
		System.out.println("This month is april");
		break;
	}
	
	case "May":{
		System.out.println("This month is may");
		break;
	}
	default:{
		System.out.println("Invalid choice!!!");
	}
	}
}
}
