package in.co.JavaPractice;

public class TestClass {
	 public static void main(String[] args) {
			//child c = new child();
		    Parent[] p1 = new Parent[2];
		    
		    p1[0] = new Child();
		    p1[1] = new Parent();
		    
		    TestClass.add(p1);		    
		}
		 
		 public static void add(Parent o2 []) {
			for(int i =0 ; i<o2.length;i++) {
			o2[i].sum();
			}
		 }
}
