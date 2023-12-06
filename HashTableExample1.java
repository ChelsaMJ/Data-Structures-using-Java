package hashtables;

import java.util.Hashtable;
public class HashTableExample1 {
    public static void main(String[] args) {

        // Create a Hashtable with Integer keys and String values
        Hashtable<Integer, String> students = new Hashtable<>();

        // methods in hashtable
       /* put()
        remove()
        get()
        clear()
        isEmpty()
        keys()
        values()
        getOrDefault()*/

        // Add some data to the Hashtable
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");
        students.put(40,"amandeep");
        System.out.println(students.get(53));
        System.out.println(students.isEmpty());

        // Retrieve and print values based on keys
        int studentId = 2;
        String studentName = students.get(studentId);
        System.out.println("Student with ID " + studentId + " is " + studentName);

        // Check if a key exists in the Hashtable
        int unknownId = 4;
        if (students.containsKey(unknownId)) {
            System.out.println("Student with ID " + unknownId + " exists.");
        } else {
            System.out.println("Student with ID " + unknownId + " does not exist.");
        }

        // Remove a key-value pair from the Hashtable
        int removeId = 1;
        students.remove(removeId);
        System.out.println("Removed student with ID " + removeId);

        // Iterate through the Hashtable and print all key-value pairs
        System.out.println("All students:");
        for (Integer key : students.keySet()) {
            String value = students.get(key);
            System.out.println("ID: " + key + ", Name: " + value);
        }
    }
}
