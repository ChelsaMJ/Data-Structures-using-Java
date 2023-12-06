package hashtables;

import java.util.Hashtable;

public class HashTableExample2 {
    public static void main(String[] args) {

        // Create a Hashtable with String keys and Integer values
        Hashtable<String, Integer> scores = new Hashtable<>();

        // Put some scores into the Hashtable
        scores.put("Alice", 95);
        scores.put("Bob", 88);
        scores.put("Charlie", 73);

        // Get and print a specific score
        String student = "Alice";
        int aliceScore = scores.get(student);
        System.out.println(student + "'s score: " + aliceScore);

        // Check if the Hashtable is empty
        boolean isEmpty = scores.isEmpty();
        System.out.println("Is the Hashtable empty? " + isEmpty);

        // Get a score with a default value if the key doesn't exist
        int defaultScore = scores.getOrDefault("David", 60);
        System.out.println("David's score (default if not found): " + defaultScore);
        System.out.println("Alice's score (default if not found): " + scores.getOrDefault("Alice",0));

        // Remove a student's score
        String studentToRemove = "Charlie";
        scores.remove(studentToRemove);
        System.out.println(studentToRemove + "'s score removed.");

        // Clear all scores in the Hashtable
        scores.clear();
        System.out.println("Scores cleared.");

        // Check if the Hashtable is empty again
        isEmpty = scores.isEmpty();
        System.out.println("Is the Hashtable empty? " + isEmpty);

    }
}
