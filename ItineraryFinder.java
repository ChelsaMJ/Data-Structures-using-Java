package hashsets;

import java.util.HashMap;
import java.util.Map;

/*
Explanation of the approach:
--------------------------------
Create a reverseTickets map to store the reverse mapping of the given tickets.
This step ensures that you can easily look up the previous destination for each city.

Iterate through the tickets and populate the reverseTickets map with the reverse mapping.

To find the starting point of the itinerary, loop through the tickets map and check if
the key of each entry is not present as a key in the reverseTickets map. If not, this
key represents the starting point.

Once you have the starting point, traverse through the map to print the itinerary.
Start with the starting point, print it, and then update temp with the value of the
key from the tickets map. Repeat this process until temp is null.
*/


public class ItineraryFinder {
    public static void findItinerary(Map<String, String> tickets) {
        // Create a map 'reverseTickets' representing the reverse mapping of 'tickets'
        Map<String, String> reverseTickets = new HashMap<>();
        for (Map.Entry<String, String> entry : tickets.entrySet()) {
            reverseTickets.put(entry.getValue(), entry.getKey());
        }

        // Get the starting point of the itinerary
        String startPoint = null;
        for (Map.Entry<String, String> entry : tickets.entrySet()) {
            if (!reverseTickets.containsKey(entry.getKey())) {
                startPoint = entry.getKey();
                break;
            }
        }

        // Print the itinerary
        String temp = startPoint;
        while (temp != null) {
            System.out.print(temp + " ");
            temp = tickets.get(temp);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample travel tickets
        Map<String, String> tickets = new HashMap<>();
        tickets.put("Mumbai", "Indore");
        tickets.put("Hyderabad", "Warangal");
        tickets.put("Indore", "Hyderabad");
        tickets.put("Delhi", "Mumbai");

        // Find and print the itinerary
        findItinerary(tickets);
    }
}
