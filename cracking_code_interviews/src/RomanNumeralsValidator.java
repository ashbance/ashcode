import java.util.HashMap;
import java.util.Map;

/**
 * Created by ashokbance on 17/01/2017.
 */
public class RomanNumeralsValidator {

    Map<Character, Integer> numerals = new HashMap<Character, Integer>(){{
        put('M', 1000);
        put('D', 500);
        put('C', 100);
        put('L', 50);
        put('X', 10);
        put('V', 5);
        put('I', 1);
    }};

    public static void main(String[] args) {
        validate("MCMLXXXI");
    }



    private static boolean validate(String roman) {

        char[] chars = roman.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean failed = false;

        for (Character c : chars) {
            sb.append(c);

            if (exceeds4SameChars(sb)) {
                failed = true;
            }

            if (violatesBigToSmall(sb)) {

            }





        }
    }


    private static boolean exceeds4SameChars(String current, Character c) {
        String next = c.toString();

        if (s.length() > 4) {
            String sub = s.substring(s.length()-4, s.length());



        }
    }

    private static boolean violatesBigToSmall(String current, Character c) {
        String lastChar = s.length()

        if ()


    }




}
