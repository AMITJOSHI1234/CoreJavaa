package in.co.Inheritance;

public class MainTestClass {
public static void main(String[] args) {
	Trangle t = new Trangle();
	
	t.setcolour("Red");
	t.setborder(1.22);
	t.setheight(5);
	t.setLength(10);
	
	String colour = t.getcolour();
	System.out.println("Colour:"+colour);
	
	double border = t.getborder();
	System.out.println("Border:"+border);
	
	double height = t.getheight();
	System.out.println("Height:"+height);
	
	double length = t.getLength();
	System.out.println("Length:"+length);
	
	double AreaTrangle = t.areaTrangle();
	System.out.println("Area of trangle is:"+AreaTrangle);
	
	Circle c = new Circle();
	
	c.setHeight(10);
	c.setWidth(50);
	
	double height1 = c.getHeight();
	System.out.println("Height of rectangle is:"+height1);
	
	double width = c.getWidth();
	System.out.println("Width of rectangle is:"+width);
	
	double RectangleArea = c.Recarea();
	System.out.println("Area of rectangle is:"+RectangleArea);
	
	c.setRadius(12);
	
	double radius = c.getRadius();
	System.out.println("Radius of circle is:"+radius);
	
	double circle = c.CircleArea();
	System.out.println("Area of circle is:"+circle);
	
	//ShapeInherit s = new Circle();
	Circle c1 = (Circle) new ShapeInherit();

	
}
}
