package hello;
public class BinarySearchExample {
	public static void main(String[] args) {
		int[] numbers= {8,2,1,6,5};
		int target=1;
		int left=0;
		int right=numbers.length-1;
		boolean found=false;
		while(left<=right) {
			int mid=(left+right)/2;
			if(numbers[mid]==target) {
				System.out.println("found " + " "+" " + target + " at index" +  " " +mid);
				found=true;
				break;
			}else {
				left=mid+1;
			}
		}
		if(!found) {
			System.out.println("number not found");
		}
	}
}
