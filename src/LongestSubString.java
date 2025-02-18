public class LongestSubString {
    public void longest(String s) {
        String res = "";
        for (int i = 1; i < s.length(); i++) {
            int high = i;
            int low = i;
            while (s.charAt(low) == s.charAt(high)) {
                high++;
                low--;

                if (low == -1 || high == s.length()) {
                    break;
                }
            }

            String palindrome = s.substring(low + 1, high);
            if(palindrome.length() > res.length()){
                res = palindrome;
            }

            high = i;
            low = i-1;

            while (s.charAt(low ) == s.charAt(high)){
                high++;
                low--;
                if(low==-1 || high == s.length()){
                    break;
                }
            }
            palindrome = s.substring(low+1,high);
            if(palindrome.length() > res.length()){
                res = palindrome;
            }
        }
        System.out.println(res);
    }


    public static void main(String[] args) {
        new LongestSubString().longest("xmadam");
    }
}
