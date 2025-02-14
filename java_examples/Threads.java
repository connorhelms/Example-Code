/*
 * Java Multithreading
 * Demonstrates thread creation and synchronization
 */

public class Threads {
    // Shared resource
    private static class Counter {
        private int count = 0;
        
        // Synchronized method
        public synchronized void increment() {
            count++;
        }
        
        public int getCount() {
            return count;
        }
    }
    
    // Thread class implementation
    private static class CounterThread extends Thread {
        private Counter counter;
        
        public CounterThread(Counter counter) {
            this.counter = counter;
        }
        
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        
        // Create multiple threads
        Thread t1 = new CounterThread(counter);
        Thread t2 = new CounterThread(counter);
        
        // Start threads
        t1.start();
        t2.start();
        
        // Wait for threads to complete
        t1.join();
        t2.join();
        
        System.out.println("Final count: " + counter.getCount());
    }
} 