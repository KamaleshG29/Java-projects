package kiran;

import java.util.TreeSet;
import java.util.Scanner;
public class TreesetEx {

	public static void main(String[] args) {
		TreeSet<String> k=new TreeSet<String>();
		//k.add("Sumit");
		//k.add("Karan");
		//k.add("Anjali");
		//k.add("Mohan");
		//k.add("Zoya");
		//System.out.println(k);
		//System.out.println(k.reversed());
		k.add("Keyboard");
		k.add("Mouse");
		k.add("Monitor");
		k.add("CPU");
		k.add("webcam");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a user name: ");
        String name=sc.nextLine();
        //contains key used for checking 
        if(k.contains(name)) {
        	System.out.println("the product exist");
        }
        else {
        	System.out.println("the product doesn't contains");
        }
	}
}
