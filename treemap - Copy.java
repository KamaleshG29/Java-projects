package kiran;
import java.util.*;
public class treemap {

	public static void main(String[] args) {
		TreeMap<String,Long> phonebook=new TreeMap<>();
		phonebook.put("Alice",(long) 1232454545);//phonebook
		phonebook.put("Bob",(long) 1238726148);
		phonebook.put("David",(long) 1232454559);
		phonebook.put("Cat",(long) 1232454568);
		System.out.println(phonebook.containsKey("Alice"));//check if key contain  or not
		System.out.println(phonebook.containsValue(284149854));//check if value exists or not
		System.out.println("Phonebook");
		System.out.println(phonebook);
		
	}

}
