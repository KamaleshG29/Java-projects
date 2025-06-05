package kiran;
import java.util.TreeMap;
public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String>student  =new TreeMap<Integer,String>();
		student.put(101,"Alice");
		student.put(102,"Bob");
		student.put(103,"Charlie");
		student.put(104,"Alice");
		System.out.println(student);
	}
}
