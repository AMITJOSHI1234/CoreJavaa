package in.co.OOPExcercise1;

public class MainTestQuestion1 {
public static void main(String[] args) {
	double Totalarea = 0.0;
	CircleQuestion1 c = new CircleQuestion1();
	c.setRadius(2.5);
	
	double radius = c.getRadius();
	System.out.println("Radius of circle is:"+radius);
	
	double Circlearea = c.area();
	System.out.println("Area of circle is :"+Circlearea);
	
	TrangleQuestion1 t = new TrangleQuestion1();
	t.setHeight(10);
	t.setLength(10);
	
	double height  = t.getHeight();
	System.out.println("Height of trangle:"+height);
	
	double length = t.getLength();
	System.out.println("Length of trangle:"+length);
	
	double Tranglearea = t.area();
	System.out.println("Area of trangle:"+Tranglearea);
	
	RectangleQuestion1 r = new RectangleQuestion1();
	
	r.setLength(20);
	r.setWidth(20);
	
	double length1 = r.getLength();
	System.out.println("Length of rectangle:"+length1);
	
	double width = r.getWidth();
	System.out.println("Width of rectangle:"+width);
	
	double Rectanglearea = r.area();
	System.out.println("Area of rectangle:"+Rectanglearea);
	
	Totalarea = Circlearea + Tranglearea + Rectanglearea;
	System.out.println("Sum of all areas:"+Totalarea);
}
}
