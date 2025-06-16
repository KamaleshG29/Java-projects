package javaprojects;

interface message{
	void say();
}

public class LambdaExample {

	public static void main(String[] args) {
		message hellomessage =() -> System.out.println("this is Lambda expression");
		hellomessage.say();

	}

}
