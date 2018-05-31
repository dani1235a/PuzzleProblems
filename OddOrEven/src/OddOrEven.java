import static java.util.Arrays.stream;

/**
 * Task:
 * Given an array of numbers (a list in groovy), determine whether the sum of all of the numbers is odd or even.
 *
 * Give your answer in string format as 'odd' or 'even'.
 *
 * If the input array is empty consider it as: [0] (array with a zero).
 *
 * Example:
 * oddOrEven([2, 5, 34, 6]) returns "odd".
 */
public class OddOrEven {

    public static void main(String... args) {
        int [] a = {1,44,22,56};
        System.out.println(oddOrEven(a));
        System.out.println(oddOrEven2(a));
    }


    public static String oddOrEven (int[] array) {
        int result = 0;
        for(int i:array) result += i;
        return (result%2==0)? "even":"odd";
    }

    public static String oddOrEven2 (int[] array) {
        return (stream(array).sum() %2==0)? "even":"odd";
    }
}
