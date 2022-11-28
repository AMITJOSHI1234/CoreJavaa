package in.co.Encapusulation;

public class Encapsulation2 {
private int a;
private int b;
private int d;
private int c;

public void setadd(int a, int b) {
	this.d = a;
	this.c = b;
}
public int getadd() {
	return c+d;
}

public void setsub(int a , int b) {
	this.a = a;
	this.b =b;
}

public int getsub() {
  if(a>b) {
	  return a-b;
  }else {
	  return b-a;
  }
}
}
