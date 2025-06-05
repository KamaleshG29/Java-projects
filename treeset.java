package kiran;
import java.util.TreeSet;
public class treeset {

	public static void main(String[] args) {
		TreeSet<Integer> k=new TreeSet<Integer>();
		k.add(5002);
		k.add(4998);
		k.add(5005);
		k.add(4999);
		k.add(5001);
		System.out.println(k);
		System.out.println(k.getFirst());
        System.out.println(k.last());
        System.out.println(k.higher(4999));
	}

}
