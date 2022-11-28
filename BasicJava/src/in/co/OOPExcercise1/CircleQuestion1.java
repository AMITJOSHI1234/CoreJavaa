package in.co.OOPExcercise1;

public class CircleQuestion1 extends ShapeQuestion1 {
private double radius;

public void setRadius(double radius) {
	this .radius  = radius;
}

public double getRadius() {
	return radius;
}

@Override
public double area() {
	// TODO Auto-generated method stub
	double area = 3.14 * radius * radius;
	return area;
}


}
