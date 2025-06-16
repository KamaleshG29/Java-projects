package javaprojects;

interface printable1 {
	void print();
}
class Message implements printable1{
	public void print() {
		System.out.println("Hello From INTERFACE");
	}
	
}

public class printable {

	public static void main(String[] args) {
		Message msg= new Message();
		msg.print();
		
	}

}
