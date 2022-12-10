package in.co.Genric;

public class Data2 <T> {
T value;

public Data2(T val) {
	this.value = val;
}

T getValue() {
	return value;
}

public void ShowType() {
	System.out.println("Type of T is:"+value.getClass().getName());
}
}
