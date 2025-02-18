import java.util.ArrayList;
import java.util.List;

public class PrintCode {
    public static void main(String[] args) {
        String input = "1123";
        List<String> result = new ArrayList<>();

        // Start decoding
        decode(input, 0, "", result);

        // Print all the valid combinations
        System.out.println(result);
    }

    // Recursive function to decode
    private static void decode(String input, int index, String currentString, List<String> result) {
        // Base case: If we reach the end of the string, add the current decoded string to the result
        if (index == input.length()) {
            result.add(currentString);
            return;
        }

        // Single digit case
        if (index < input.length()) {
            int singleDigit = Character.getNumericValue(input.charAt(index));
            if (singleDigit >= 1 && singleDigit <= 9) { // Valid single digit
                char mappedChar = (char) ('a' + singleDigit - 1);
                decode(input, index + 1, currentString + mappedChar, result);
            }
        }

        // Two-digit case
        if (index + 1 < input.length()) {
            int twoDigits = Integer.parseInt(input.substring(index, index + 2));
            if (twoDigits >= 10 && twoDigits <= 26) { // Valid two digits
                char mappedChar = (char) ('a' + twoDigits - 1);
                decode(input, index + 2, currentString + mappedChar, result);
            }
        }
    }
}
