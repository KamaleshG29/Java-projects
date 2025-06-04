package demo;
class cap extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("bmw car moving"+i);
		}
	}
}
class back extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("ninja car moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}
public class multithread {

	public static void main(String[] args) {
		new cap().start();
		new back().start();

	}

}
