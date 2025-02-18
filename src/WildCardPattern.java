public class WildCardPattern {
    public static void isMatch(String text, String wildcard){
        int left = 0;
        int right = wildcard.length()-1;
        while (left<right){
            while (wildcard.charAt(left)=='*' && wildcard.charAt(left)!=text.charAt(0)){
                left++;
            }
            while (wildcard.charAt(right)!=text.charAt(text.length()-1) && wildcard.charAt(right)=='*') {
                right--;
            }
            if (wildcard.charAt(left)==text.charAt(0) && wildcard.charAt(right)==text.charAt(text.length()-1)
            ) {
                System.out.println("true");
                return;
            }
            left++;
            right--;
        }
        System.out.println("false");
    }

    public static void main(String[] args) {
        isMatch("baaabab","“a*ab");
    }
}
