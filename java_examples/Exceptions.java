/*
 * Java Exception Handling
 * Shows different ways to handle exceptions
 */

public class Exceptions {
    // Custom exception class
    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    
    // Method that throws checked exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        }
        if (age > 150) {
            throw new InvalidAgeException("Age is unrealistically high");
        }
    }
    
    public static void main(String[] args) {
        try {
            validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Validation completed");
        }
        
        // Try-with-resources
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            validateAge(age);
        } catch (InvalidAgeException | java.util.InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 