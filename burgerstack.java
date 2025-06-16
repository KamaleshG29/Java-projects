package javaprojects;

import java.util.Stack;

public class burgerstack {

	public static void main(String[] args) {
		Stack<String> burgerStack = new Stack<String>();
		burgerStack.push("Burger 1");
		burgerStack.push("Burger 2");
		burgerStack.push("Burger 3");
		System.out.println("top burger"+burgerStack.peek());
		System.out.println("serving"+burgerStack.pop());
		if(burgerStack.isEmpty()) {
			System.out.println("all burgers are served");			
		}
	}

}
