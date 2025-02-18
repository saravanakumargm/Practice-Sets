public class PalindromeWithSpecialChar {
    public void isPalindrome(String word){
        int left = 0;
        int right = word.length()-1;
        while (left<=right){
            while (left<right && !(word.charAt(left)>='A' && word.charAt(left)<='Z')){
                left++;
            }
            while (left<right && !(word.charAt(right)>='A' && word.charAt(right)<='Z')) {
                right--;
            }
            if(word.charAt(left)!=word.charAt(right)){
                System.out.println("Not Palindrome");
                return;
            }
            right--;
            left++;
        }
        System.out.println("Palindrome");
    }

    public static void main(String[] args) {
        new PalindromeWithSpecialChar().isPalindrome("I DID, DID I");
    }
}
