import java.util.*;

/**
 * Your task is to make a function that can take any non-negative integer as a argument and return it with its digits
 * in descending order. Essentially, rearrange the digits to create the highest possible number.
 *
 * Examples:
 * Input: 21445 Output: 54421
 *
 * Input: 145263 Output: 654321
 *
 * Input: 1254859723 Output: 9875543221
 */

public class DescendingOrder {

    public static void main(String... args) {
        System.out.println(sortDesc(123456789));
    }

    public static int sortDesc(final int num) {
        if(num == 0) return 0;
        int number = num;
        List<Integer> ml = new ArrayList<>();
        while (number > 0) {
            int temp = number % 10;
            ml.add(temp);
            number /= 10;
        }
        Collections.sort(ml, Collections.reverseOrder());
        int total = ml.remove(0);
        for(int n:ml){
            total *= 10;
            total += n;
        }
        return total;
    }
}