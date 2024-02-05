package collections;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateElement {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 5, 3, 2, 5, 3};

        // Create a HashMap to store the count of each element
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences
        for (int num : array) {
            // Check if the number is already in the map
            if (countMap.containsKey(num)) {
                // If yes, increment its count by 1
               // System.out.println(countMap.get(num));
                countMap.put(num, countMap.get(num) + 1);
            } else {
                // If no, add the number to the map with count 1
                countMap.put(num, 1);
            }
        }
        // Print the counts
        for (int num : countMap.keySet()) {
            System.out.println(num + " has count " + countMap.get(num));
        }

       /* Map<Integer,Integer> dup = new HashMap<>();
        for (int i=0; i< array.length ; i++){
            if (dup.containsKey(array[i])){
                dup.put(array[i],dup.get(array[i])+1);
            }
            else {
                dup.put(array[i],1);
            }


        }


        for (Map.Entry<Integer,Integer> v : dup.entrySet()) {
            System.out.println(v.getKey() + " has count " + v.getValue());
        }
*/


    }
    }
