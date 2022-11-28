package in.co.OOPExcercise;

public class Question1Shape {
public static void main(String[] args) {
	//Question1Circle c =new Question1Circle();
	Question1Shape q = new Question1Shape();
	q.ShapeArea();
   
}

public void ShapeArea() {
	//Circle
	Question1Circle c =new Question1Circle();
	  c.setRadius(2.14);
	 double radius = c.getRadius();
	 System.out.println("Radius of circle is:"+radius);
	 double circlearea = c.Circlearea();
	 //Trangle
	 Question1Trangle t = new Question1Trangle();
	 t.setHeight(10.5);
	 t.setLength(20);
	 
	 double height = t.getHeight();
	 System.out.println("Height of tangle:"+height);
	 
	 double length = t.getLength();
	 System.out.println("Length of trangle:"+length);
	 
	 double tranglearea = t.Tranglearea();
	 
	 //rectangle
	 
	 Question1Rectangle r = new Question1Rectangle();
	 r.setLength(4.5);
	 r.setWidth(5.50);
	 
	 double length1= r.getLength();
			 System.out.println("Length of rectangle:"+length1);
			 
	double width = r.getwidth();
	System.out.println("Width of rectangle:"+width);
	
	double rectanglearea = r.Rectanglearea();
	 //Area
	double shapearea =0.0;
	
	shapearea = shapearea+circlearea+tranglearea+rectanglearea;
	
	System.out.println("Total area of shape class is:"+shapearea);
	
}
}
