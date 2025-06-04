package javapj;
import java.util.*;
public class treemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(1,"mani");
		tm.put(3,"pinky");
		tm.put(2,"jhony");
		tm.put(5,"bob");
		tm.put(4,"alice");
		System.out.println(tm);
		System.out.println(tm.containsKey(4));
		System.out.println(tm.containsValue("kiran"));
		System.out.println(tm.containsKey(8));
		System.out.println(tm.containsValue("jhony"));
		TreeMap<String,Long> phoneBook=new TreeMap<String,Long>();
		phoneBook.put("Alice", (long)123456789);
        phoneBook.put("David", (long)848586878);
        phoneBook.put("Aanad", (long)345678901);
        phoneBook.put("Charlie",(long)456789012);
        System.out.println("phoneBook:");
        System.out.println(phoneBook);
	}

}
