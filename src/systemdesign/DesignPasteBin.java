package systemdesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesignPasteBin {
    public static void main(String[] args) {
        int num = 12345;
        int base = 62;
        ArrayList<Integer> encoded = baseEncode(num, base);
        System.out.println(encoded);
    }

    public static ArrayList<Integer> baseEncode(int num, int base) {
        ArrayList<Integer> digits = new ArrayList<>();

        while (num > 0) {
            int remainder = num % base;
            digits.add(remainder);
            num = num / base;
        }

        Collections.reverse(digits);
        return digits;
    }
}