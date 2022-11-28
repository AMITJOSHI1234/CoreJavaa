package in.co.OOPExcercise1;

public class RectangleQuestion1 extends ShapeQuestion1 {
private double length;
private double width;

public void setLength(double length) {
	this.length = length;
}

public double getLength() {
	return length;
}

public void setWidth(double width) {
	this.width = width;
}

public double getWidth() {
	return width;
}

@Override
public double area() {
	// TODO Auto-generated method stub
	double area = length * width;
	return area;
}

}
