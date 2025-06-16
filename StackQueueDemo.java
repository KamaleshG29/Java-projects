package javaprojects;

import java.util.LinkedList;

import java.util.Stack;
import java.util.Queue;

public class StackQueueDemo {

    public static void main(String[] args) {
        System.out.println("=== Stack Demo ===");
        Stack<String> toybox = new Stack<String>();
        toybox.push("ball 1");
        toybox.push("blocks 2");
        toybox.push("puzzle 3");
        System.out.println("Stack contents: " + toybox);
        String lastOut = toybox.pop();
        System.out.println("Popped item: " + lastOut);
        System.out.println("Stack after pop: " + toybox);
        System.out.println("\n=== Queue Demo ===");
        Queue<String> kids = new LinkedList<String>();
        kids.add("maya 1");
        kids.add("leo 2");
        kids.add("nina 3");
        System.out.println("Queue contents: " + kids);
        
        String firstOut = kids.remove();
        System.out.println("Removed item: " + firstOut);
        System.out.println("Queue after removal: " + kids);
    }
}