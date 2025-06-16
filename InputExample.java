package javaprojects;

import java.util.Scanner;

public class InputExample {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("enter the age ");
		int age =sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name =sc.nextLine();
		System.out.println(name+age);

	}

}
