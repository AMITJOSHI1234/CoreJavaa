package in.co.JavaPractice;

public class Testmain {
public static void main(String[] args) {
	Shape s[] = new Shape[1];
	s[0] = new Circle();
	
	Circle c = new Circle();
	c.setRadius(1.2);
	//double area = area(s);
	//System.out.println(area);
	area(s);
}

public static void area(Shape s[]) {
	double totalarea = 0;
	for(Shape s1 : s) {
		 s1.area();
	}
//	return totalarea;
}
}
