package javapj;
import java.util.*;
import java.util.HashMap;
class arraylist{
	public arraylist() {
		ArrayList<String> al=new ArrayList<String>();
		al.add("hari");
		al.add("ameen");
		System.out.println("arraylist:");
		System.out.println(al);
	}
}
class linkedlist extends arraylist{
	public linkedlist() {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(101);
		ll.add(104);
		ll.add(105);
		ll.add(102);
		System.out.println("linked list:");
		System.out.println(ll);
	}
}
class hhash extends linkedlist{
	public hhash() {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "nani");
		hm.put(2, "mahesh");
		hm.put(3, "prabhas");
		hm.put(3, "aa");
		System.out.println("hash map:");
		System.out.println(hm);
	}
}
class hashset extends hhash{
	public hashset() {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(101);
		hs.add(104);
		hs.add(105);
		hs.add(102);
		System.out.println("hashset");
		System.out.println(hs);
	}
}



public class inheritance {

	public static void main(String[] args) {
		//linkedlist l=new linkedlist();
		hashset w=new hashset();
		w.hashCode();
	}

}
