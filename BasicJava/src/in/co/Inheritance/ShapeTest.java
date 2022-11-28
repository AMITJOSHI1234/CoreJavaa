package in.co.Inheritance;

public class ShapeTest {
public static void main(String[] args) {
	ShapeCircle c = new ShapeCircle(1.5);
	
	double radius = c.getRadius();
	System.out.println("Radius of circle is:"+radius);
	
	double Circlearea = c.area();
	System.out.println("Area of circle:"+Circlearea);
	
	ShapeRectangle r = new ShapeRectangle(10, 40);
	
	double length = r.getLength();
	System.out.println("Length of rectangle is:"+length);
	
	double width = r.getWidth();
	System.out.println("Width of rectangle is:"+width);
	
	double Rectarea = r.area();
	System.out.println("Area of rectangle is:"+Rectarea);
	
	Shape s[] = new Shape[2];
	s[0] = new ShapeCircle(1.5);
	s[1] = new ShapeRectangle(10,40);
	
	double total = area(s);
	System.out.println("Total area of all shape:"+total);
}

public static double area(Shape s[]) {
	double area = 0.0;
	for(Shape s1:s) {
		area = area + s1.area();
	}
	return area;
}
}
