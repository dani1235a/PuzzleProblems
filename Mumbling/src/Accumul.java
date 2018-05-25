/**
 * This time no story, no theory. The examples below show you how to write function accum:
 *
 * Examples:
 *
 * Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
 * Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */
public class Accumul {

    public static void main(String... args){
        System.out.println(accum("ThisIsATest"));
    }

    public static String accum(String s) {
        String ret = "";
        for(int i = 0; i < s.length(); i++){
            if(i!=0) ret += "-";
            for(int y = 0; y <= i; y++) {
                if(y == 0) {
                    ret += String.valueOf(s.charAt(i)).toUpperCase();
                } else {
                    ret += String.valueOf(s.charAt(i)).toLowerCase();
                }
            }
        }

        return ret;
    }
}