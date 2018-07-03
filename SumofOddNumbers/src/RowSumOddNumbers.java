/*
Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:

rowSumOddNumbers(1); // 1
rowSumOddNumbers(2); // 3 + 5 = 8


 */

class RowSumOddNumbers {
    public static void main(String... args) {
        System.out.println(rowSumOddNumbers(5));
    }


    public static int rowSumOddNumbers(int n) {
        int sum = 0;
        int start = 1;
        // calculate starting number
        // +2, +4, +6, +8...
        int multiplier = 2;
        for(int i = 0; i < n - 1; i++) {
            start += multiplier;
            multiplier += 2;
        }

        for (int i = 0; i < n; i++) {
            sum += start;
            start += 2;
        }
        return sum;
    }

    //second attempt
    public static int rowSumOdd2(int n) {
        return n * n * n;
    }
}