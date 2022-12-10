package in.co.Collection;

public class TestMain2 {
public static void main(String[] args) {
HashCodeNEquals2 hq = new HashCodeNEquals2("101", "Amit", 95);
HashCodeNEquals2 hq1 = new HashCodeNEquals2("101", "Joshi", 98);

System.out.println(hq.hashCode());
System.out.println(hq1.hashCode());

  if(hq.hashCode() == hq1.hashCode()) {
	  if(hq.rollno.equals(hq1.rollno)) {
		  System.out.println("Both are same");
	  }else {
		  System.out.println("Both are not same");
	  }
  }
}
}
