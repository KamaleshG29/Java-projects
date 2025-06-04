package javapj;

import java.util.HashMap;

public class hashmap {
	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"john");
		h.put(2, "harry");
		h.put(3, "preethi");
		h.put(4, "michel");
		h.put(5, "raju");
		System.out.println(h);
		h.remove(1);
		System.out.println(h);
		h.put(3,"jhony");
		System.out.println(h);
		boolean hash1=h.containsKey(5);
		boolean hash2=h.containsValue("preethi");
		System.out.println(hash1);
		System.out.println(hash2);
	}
}
