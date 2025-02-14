/*
 * Java Collections Framework
 * Demonstrates various collection types and their usage
 */

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // ArrayList - Dynamic array implementation
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.remove("Apple");
        
        // LinkedList - Doubly-linked list implementation
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);  // Add to front
        linkedList.addLast(3);   // Add to end
        linkedList.add(2);       // Add to end
        
        // HashSet - Unordered collection of unique elements
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Blue");
        hashSet.add("Red");  // Duplicate not added
        
        // HashMap - Key-value pairs
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        
        // Iterating over collections
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        
        // Using Iterator
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
} 