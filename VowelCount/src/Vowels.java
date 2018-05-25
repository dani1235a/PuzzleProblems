import java.util.HashMap;

/**
 * Return the number (count) of vowels in the given string.
 *
 * We will consider a, e, i, o, and u as vowels for this Kata.
 *
 * The input string will only consist of lower case letters and/or spaces.
 */
public class Vowels {

    public static void main(String... args) {
        System.out.println(Vowels.getCount("abracadabra"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        for(char c:str.toCharArray()){
            if(hm.containsKey(c)) {
                hm.replace(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        if(hm.containsKey('a')) vowelsCount += hm.get('a');
        if(hm.containsKey('e')) vowelsCount += hm.get('e');
        if(hm.containsKey('i')) vowelsCount += hm.get('i');
        if(hm.containsKey('o')) vowelsCount += hm.get('o');
        if(hm.containsKey('u')) vowelsCount += hm.get('u');

        return vowelsCount;
    }

}