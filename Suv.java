package javaprojects;

abstract class Cars {
    abstract void Start();
    abstract void drive();
    abstract void stop();
    
    public void Drive() {
        System.out.println("car is moving");
    }
}

class Autocar extends Cars {
    void Start() {
        System.out.println("Car auto start button");
    }
    
    void drive() {
        System.out.println("car auto driving");
    }
    
    void stop() {
        System.out.println("car is stop");
    }
}

public class Suv {
    public static void main(String[] args) {
        Autocar c = new Autocar();
        c.Start();
        c.drive();
        c.stop();
        c.Drive(); // This calls the inherited method from Car
    }
}