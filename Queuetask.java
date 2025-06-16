package javaprojects;

import java.util.LinkedList;
import java.util.Queue;

public class Queuetask {

	public static void main(String[] args) {
		Queue<String> kids = new LinkedList<String>();
		kids.add("kid 1");
		kids.add("kid 2");
		kids.add("kid 3");
		kids.add("kid 4");
		kids.add("kid 5");
		System.out.println(kids);
		String firstOut = kids.remove();
		System.out.println(firstOut);
		System.out.println("the kids are waiting for icecream:"+kids);
		
		
	}

}
