package javaprojects;

public class Student {
	
    private String name;
    private int rollNumber;
    private double marks;

  
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public double getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public boolean isPass() {
        return marks >= 50;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + (isPass() ? "PASS" : "FAIL"));
        System.out.println("--------------------");
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("John", 101, 75);
        Student s2 = new Student("Mary", 102, 40);
        Student s3 = new Student("Tom", 103, 85);
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        System.out.println("Student 1 name: " + s1.getName());
        System.out.println("Student 1 pass? " + s1.isPass());
        s2.setMarks(60);
        System.out.println("After updating Mary's marks:");
        s2.displayInfo();
    }
}