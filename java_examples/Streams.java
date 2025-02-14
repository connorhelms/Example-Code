/*
 * Java Streams API
 * Shows modern Java stream operations
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Bob", "Alice");
        
        // Filter operation
        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("J"))
            .collect(Collectors.toList());
        
        // Map operation
        List<Integer> nameLengths = names.stream()
            .map(String::length)
            .collect(Collectors.toList());
        
        // Reduce operation
        int totalLength = names.stream()
            .mapToInt(String::length)
            .sum();
        
        // Parallel stream
        boolean anyMatch = names.parallelStream()
            .anyMatch(name -> name.length() > 4);
        
        // Print results
        System.out.println("Filtered names: " + filteredNames);
        System.out.println("Name lengths: " + nameLengths);
        System.out.println("Total length: " + totalLength);
        System.out.println("Any match: " + anyMatch);
    }
} 