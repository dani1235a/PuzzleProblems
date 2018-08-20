import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Given an array, find the int that appears an odd number of times.
 *
 * There will always be only one integer that appears an odd number of times.
 */

public class FindOdd {

    public static void main(String... args) {

    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i:a){
            if (myMap.containsKey(i)) {
                myMap.put(i, myMap.get(i)+1);
            } else {
                myMap.put(i, 1);
            }
        }

        int oddone = 0;
        for (Map.Entry<Integer, Integer> e : myMap.entrySet()){
            if (e.getValue() % 2 != 0) oddone = e.getKey();
        }

        return oddone;
    }

}
