package kiran;
import java.util.*;
public class binarysearchEx {

	public static void main(String[] args) {
		String[] names= {"Amit","Divya","Priya","Zoya"};
		Scanner sc=new Scanner(System.in);
		System.out.println("input name");
		String name=sc.nextLine();
		if(Arrays.asList(names).contains(name)) {
			System.out.println("Name Exists");
		}
		else {
			System.out.println("Name doesnot exists");
		}
	}

}
