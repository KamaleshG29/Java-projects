package demo;
public class QuadraticTimeExample {
	public static void main(String[] args) {
		int[] numbers= {1,3,5,7};
		boolean hashDuplicate=false;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					hashDuplicate=true;
					System.out.println("duplicate found:" + numbers[i]);
				}
			}
		}
		if(!hashDuplicate) {
			System.out.println("no duplicate found");
		}
	}
}
