package in.co.Polymorphism;

public class Overriding {
public static void main(String[] args) {
//	ChildOverriding c = new ChildOverriding();
	
//	c.sum();
	
	ParentOverriding p [] = new ParentOverriding[1];
	
	p[0] = new ChildOverriding();
	
	add(p);
}

public static void add(ParentOverriding p []) {
	for(ParentOverriding p1 : p) {
		p1.sum();
	}
}
}
