package in.co.OOPExcercise1;

public class TrangleQuestion1 extends ShapeQuestion1 {
private double length;
private double height;

public void setLength(double length) {
	this.length = length;
}

public double getLength() {
	return length;
}

public void setHeight(double height) {
	this.height = height;
}

public double getHeight() {
	return height;
}

@Override
public double area() {
	// TODO Auto-generated method stub
   double area = 0.5 * length * height;
   return area;
}


}
