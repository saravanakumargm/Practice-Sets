import java.util.HashSet;

public class RemoveRepeated {
    public static String transform(String input) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seenCharacters = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = Character.toLowerCase(input.charAt(i));
            char original = input.charAt(i);

            if (seenCharacters.contains(currentChar)) {
                // Handle character replacement for duplicate
                if (Character.isDigit(original)) {
                    original = incrementDigit(original);
                    while (seenCharacters.contains(currentChar)){
                        currentChar = incrementDigit(currentChar);
                        original = currentChar;
                    }

                } else if (Character.isAlphabetic(original) ) {
                    System.out.println("alpha " + original);
                    original = incrementAlphabet(original);
                    while (seenCharacters.contains(currentChar)){
                        currentChar = incrementAlphabet(currentChar);
                        if(currentChar>='A' && currentChar<='Z')
                            original = Character.toLowerCase((char) (currentChar+1));
                        else
                            original =Character.toUpperCase( (char) (currentChar+1));
                    }
                }
            }

            // Add the transformed (or original) character to the result
            result.append(original);

            // Add the updated character to the seen set
            seenCharacters.add(original);
        }

        return result.toString();
    }

    private static char incrementDigit(char digit) {
        return (char) (((digit - '0' + 1) % 10) + '0');
    }

    private static char incrementAlphabet(char letter) {
        if (Character.isLowerCase(letter)) {
            return (char) (((letter - 'a' + 1) % 26) + 'a');
        } else {
            return (char) (((letter - 'A' + 1) % 26) + 'A');
        }
    }

    public static void main(String[] args) {
        // Test cases
        String testCase1 = "Java1234";
        String testCase2 = "Python1223";
        String testCase3 = "aBuzZ9900";

        System.out.println("Output for TestCase 1: " + transform(testCase1));
        System.out.println("Output for TestCase 2: " + transform(testCase2));
        System.out.println("Output for TestCase 3: " + transform(testCase3));
    }
}
