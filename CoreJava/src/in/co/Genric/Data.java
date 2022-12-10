package in.co.Genric;

public class Data <T> {
T value;

public Data(T val) {
	this.value = val;
}

T getValue() {
	return value;
}

void ShowType() {
	System.out.println("Type of T is:"+value.getClass().getName());
}
}
