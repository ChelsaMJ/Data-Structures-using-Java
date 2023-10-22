package hashsets;
import java.util.HashSet;
//import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple");
        hashSet.add("Date");
        hashSet.add("Cherry");

        // Display the HashSet
        System.out.println("HashSet: " + hashSet);

        // Check if an element exists
        boolean containsBanana = hashSet.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        // Remove an element
        hashSet.remove("Cherry");
        System.out.println("After removing 'Cherry': " + hashSet);

        // Trying to remove a non-existing element
        hashSet.remove("Cherry");
        System.out.println("After removing 'Cherry': " + hashSet);

        // Check if the HashSet is empty
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);

        // Size of the HashSet
        int size = hashSet.size();
        System.out.println("Size of the HashSet: " + size);

        // Create another HashSet and perform set operations
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Banana");
        anotherSet.add("Grapes");

        // Union
        HashSet<String> unionSet = new HashSet<>(hashSet);
        unionSet.addAll(anotherSet);
        System.out.println("Union of two sets: " + unionSet);

        // Intersection
        HashSet<String> intersectionSet = new HashSet<>(hashSet);
        intersectionSet.retainAll(anotherSet);
        System.out.println("Intersection of two sets: " + intersectionSet);

        // Difference
        HashSet<String> differenceSet = new HashSet<>(hashSet);
        differenceSet.removeAll(anotherSet);
        System.out.println("Difference of two sets: " + differenceSet);
    }
}
