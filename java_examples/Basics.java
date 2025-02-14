/*
 * Basic Java Programming Concepts
 * This file covers fundamental Java concepts with detailed explanations
 */

public class Basics {
    public static void main(String[] args) {
        // Variables and Data Types
        String name = "John Doe";  // String variable
        int age = 25;             // Integer variable
        double height = 1.75;     // Double variable
        boolean isStudent = true;  // Boolean variable
        
        // String concatenation
        String greeting = "Hello, " + name + "!";
        
        // Basic arithmetic
        int a = 10, b = 5;
        int sum = a + b;        // Addition
        int diff = a - b;       // Subtraction
        int prod = a * b;       // Multiplication
        double quot = (double)a / b;  // Division with type casting
        
        // Output using System.out.println
        System.out.println(greeting);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + prod);
        System.out.println("Difference: " + diff);
        System.out.println("Quotient: " + quot);
    }
} 