package javaprojects;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine().toLowerCase();
        
        switch(day) {
            case "monday":
                System.out.println("Let's start Python");
                break;
            case "tuesday":
                System.out.println("Let's start Java");
                break;
            case "wednesday":
                System.out.println("Let's start C");
                break;
            case "thursday":
                System.out.println("Let's start Web Development");
                break;
            case "friday":
                System.out.println("Let's start C++");
                break;
            case "saturday":
                System.out.println("Let's start Machine Learning");
                break;
            case "sunday":
                System.out.println("Let's start JavaScript");
                break;
            default:
                System.out.println("Please enter a valid day of the week!");
                break;
        }
        
        sc.close();
    }
}