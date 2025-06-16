package javaprojects;
class candy implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("BMW car moving"+i);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
		}
	}
}
}
class ballon implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("ninja Bike is moving"+i);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
		}
		}
	}
}
public class Simplerace1 {

	public static void main(String[] args) {
		Thread caThread =new Thread(new candy());
		Thread baThread =new Thread(new ballon());
		System.out.println("Goo");
		caThread.start();
		baThread.start();
 
	}

}
