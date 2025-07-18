import java.util.*;
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just add 1 and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Otherwise, set current digit to 0 and carry 1 to the next digit
            digits[i] = 0;
        }
        
        // If we are here, all digits were 9, so we need an extra digit at the beginning
        int[] result = new int[n + 1];
        result[0] = 1;  // All other digits are 0 by default
        return result;
    }

    // Sample usage
    public static void main(String[] args) {
        int[] input = {8,9,7};
        int[] result = plusOne(input);
        System.out.println(Arrays.toString(result)); // Output: [1, 0, 0, 0]
    }
}