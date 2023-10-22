package hashsets;
import java.util.HashSet;

/*
Explanation:
1. Create a HashSet called lockSet to store the lock characters.

2. Iterate through the locks array and add each lock's character to the
   lockSet using the add method.

3. Iterate through the keys array and check if the corresponding key is
   present in the lockSet using the contains method. If it's present,
   assign the key to the corresponding lock position in the locks array.
   If not, print "Not possible" and return, as this means there's no
   matching lock for that key.

4. Finally, iterate through both the keys and locks arrays to print the matching pairs.
*/

public class MatchingLocksAndKeys {
    public static void matchLocksAndKeys(char[] locks, char[] keys) {
        int n = locks.length;

        // Create a HashSet to store lock characters
        HashSet<Character> lockSet = new HashSet<>();

        // Add lock characters to the HashSet
        for (char lock : locks) {
            lockSet.add(lock);
        }

        // Match keys with locks
        for (int i = 0; i < n; i++) {
            char key = keys[i];
            if (lockSet.contains(key)) {
                locks[i] = key;
            } else {
                System.out.println("Not possible");
                return;
            }
        }

        // Print the matching locks and keys
        for (int i = 0; i < n; i++) {
            System.out.println(keys[i] + " " + locks[i]);
        }
    }

    public static void main(String[] args) {
        // Sample input
        char[] keys = {'#', '%', '!', '@', '$'};
        char[] locks = {'!', '@', '#', '$', '%'};

        matchLocksAndKeys(locks, keys);
    }
}