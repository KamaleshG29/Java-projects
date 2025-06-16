package javaprojects;

public class SimpleWrapper {
    public static void main(String[] args) {
        // Primitive types
        int a = 1;
        double price = 99.99;
        
        // Wrapper classes
        Integer b = 1;
        Double price2 = 99.99;
        
        // Print all values
        System.out.println(a);
        System.out.println(b);
        System.out.println(price);
        System.out.println(price2);
        
        // Simple wrapper class methods
        System.out.println("Max integer: " + Integer.MAX_VALUE);
        System.out.println("Convert string to number: " + Integer.parseInt("123"));
    }
}