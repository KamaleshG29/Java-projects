package javapj;

public class EncapulationEx {
	private String name;
	private int rollno;
	private int marks;
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String checkResult() {
		if(marks>=40) {
			return "pass";
		}else {
			return "fail";
		}
	}
	public void display() {
		System.out.println("RollNo: "+" "+getRollno());
		System.out.println("Name: "+" "+getName());
		System.out.println("Marks: "+" "+getMarks());
		System.out.println("Result: "+" "+checkResult());

	}

	public static void main(String[] args) {
		EncapulationEx  obj=new EncapulationEx ();
		obj.setRollno(101);
		obj.setName("hruday");
		obj.setMarks(78);
		System.out.println("student details:");
		obj.display(); 
	}

}
