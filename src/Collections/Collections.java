package Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // List Example (ArrayList)
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Banana3");
        list.add("Banana4");
        list.add(null);

        System.out.println("List: " + list);
        list.remove("Banana");
        list.remove(2);
        System.out.println("List after removal: " + list);

        // Set Example (HashSet)
        Set<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Bird");
        set.add("Dog"); // Duplicate, will not be added
        System.out.println("Set: " + set);
        set.remove("Cat");
        System.out.println("Set after removal: " + set);

        // Queue Example (PriorityQueue)
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(15);
        System.out.println("Queue: " + queue);
        queue.poll(); // Removes the head of the queue
        System.out.println("Queue after poll: " + queue);

        // Deque Example (ArrayDeque)
        Deque<String> deque = new ArrayDeque<>();
        deque.add("First");
        deque.add("Second");
        deque.add("Third");
        System.out.println("Deque: " + deque);
        deque.removeFirst();
        System.out.println("Deque after removing first: " + deque);
        deque.removeLast();
        System.out.println("Deque after removing last: " + deque);

        // Map Example (HashMap)
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Jack", 20);
        System.out.println("Map: " + map);
        map.remove("Jane");
        System.out.println("Map after removal: " + map);
    }
}
