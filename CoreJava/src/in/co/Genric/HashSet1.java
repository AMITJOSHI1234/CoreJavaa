package in.co.Genric;

import java.util.HashMap;

public class HashSet1 {
public static void main(String[] args) {
	HashMap<String,Integer> hash = new HashMap<String , Integer>();
	
	hash.put("A", 45);
	hash.put("B", 76);
	hash.put("C", null);
	hash.put("D", 77);
	hash.put(null, null);
	
	System.out.println(hash);
	
}
}
