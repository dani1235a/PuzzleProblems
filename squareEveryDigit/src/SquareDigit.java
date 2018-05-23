/**
 * Welcome. In this kata, you are asked to square every digit of a number.
 *
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 *
 * Note: The function accepts an integer and returns an integer
 */
public class SquareDigit {

    public static void main(String... args){
        System.out.print(new SquareDigit().squareDigits(5345));
    }

    public int squareDigits(int n) {
        String output = "";

        // need to break apart into individual digits.
        String input = Integer.toString(n);
        //grab each individual char for maths operations.
        for(char c: input.toCharArray()){
            int cValue = (int) c - 48;
            cValue = (int) Math.pow(cValue, 2);
            output += String.valueOf(cValue);
        }
        int out = Integer.valueOf(output);
        return out;
    }

}