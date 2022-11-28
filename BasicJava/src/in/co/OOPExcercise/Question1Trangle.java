package in.co.OOPExcercise;

public class Question1Trangle {
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
public double Tranglearea() {
	double area = 0.5 * height * length;
	return area;
}

}
