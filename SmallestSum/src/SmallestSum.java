/**
Create a function that returns the sum of the two lowest positive numbers given an
array of minimum 4 integers. No floats or empty arrays will be passed.

For example, when an array is passed like [19, 5, 42, 2, 77],
the output should be 7.

[10, 343445353, 3453445, 3453545353453] should return 3453455.

Hint: Do not modify the original array.
 */

public class SmallestSum {

    public static void main(String... args) {
        int [] array = {323,223,3334,421,5334,632};

        System.out.println(smallestSum(array));
    }

    /**
     * Takes in an integer array and output the sum of the smallest two numbers.
     * @param input
     * @return
     */
    public static int smallestSum(int [] input) {
        int smallsum = 0;

        int smallest1 = 0;
        int smallest1location = 0;
        int smallest2 = 1000000000;

        //first loop to get the smallest int.
        for (int i = 0; i < input.length; i++){
            if(i == 0) {
                smallest1 = input[i];
                smallest1location = i;
            }
            if(input[i] < smallest1) {
                smallest1 = input[i];
                smallest1location = i;
            }
        }

        //get the second smallest digit.
        for(int i = 0; i < input.length; i++) {
            if(input[i] < smallest2 && i != smallest1location) {
                smallest2 = input[i];
            }
        }
        smallsum = smallest1 + smallest2;

        return smallsum;
    }
}
