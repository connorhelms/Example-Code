/*
 * Java Methods
 * Demonstrates method definition and usage
 */

public class Methods {
    // Method with return value and parameters
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method with no return value (void)
    public static void printMessage(String message) {
        System.out.println(message);
    }
    
    // Method overloading - same name, different parameters
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;  // Circle area
    }
    
    public static double calculateArea(double length, double width) {
        return length * width;  // Rectangle area
    }
    
    public static void main(String[] args) {
        int sum = add(5, 3);
        printMessage("Hello, World!");
        double circleArea = calculateArea(2.0);
        double rectangleArea = calculateArea(4.0, 5.0);
        System.out.println("Sum: " + sum);
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
    }
} 