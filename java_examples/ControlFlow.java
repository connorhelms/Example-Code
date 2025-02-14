/*
 * Control Flow in Java
 * Demonstrates conditional statements and loops
 */

public class ControlFlow {
    public static void main(String[] args) {
        // If-else conditional statement
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
        
        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // Enhanced for loop (for-each)
        String[] fruits = {"apple", "banana", "orange"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        // While loop
        int count = 0;
        while (count < 3) {
            System.out.println("While count: " + count);
            count++;
        }
    }
} 