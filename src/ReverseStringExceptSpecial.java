import java.util.Arrays;

public class ReverseStringExceptSpecial {
    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Skip special characters
            if (!Character.isLetterOrDigit(arr[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(arr[right])) {
                right--;
            } else {
                // Swap characters if both are valid
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }

    private boolean isLetterOrDigit(char c) {
        if((c>='A' && c<='Z') || ( c>='a' && c<='z')){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("sa%ra@"));
    }
}
