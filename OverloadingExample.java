package javaprojects;








class Car{
	public void BMW() {
		for(int i=1;i<=3;i++){
			System.out.println("car moving"+i);
		}
	}
}
class Bike{
	public void ninja() {
		for(int i=1;i<=3;i++){
			System.out.println("bike is moving");
		}
		
	}
	
}
public class OverloadingExample{
	public static void main(String[]args) {
		Car c = new Car();
		c.BMW();
		Bike b= new Bike();
		b.ninja();
	}
}