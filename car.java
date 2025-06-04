package demo;
class CARS{
	public void BMW() {
		for(int i=1;i<=3;i++) {
			System.out.println("BMW"+i);
		} 
	}
}
class bike{
	public void honda() {
		for(int i=1;i<=3;i++) {
			System.out.println("HONDA"+i);
		}
	}
}
public class car {

	public static void main(String[] args) {
		CARS c=new CARS();
		c.BMW();
		bike h=new bike();
		h.honda();

	}

}
