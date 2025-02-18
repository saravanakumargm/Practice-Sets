import java.util.HashMap;

public class LongestWithoutRepeating {
    public int longest(String s){
        int maxLen = 0;
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <s.length(); j++) {
                if(hash[s.charAt(j)]==1)
                    break;
                hash[s.charAt(i)] = 1;
                maxLen = Math.max(maxLen,j-i+1);
            }
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        while (right<s.length()){
            char c = s.charAt(right);
           if(hash[c]!=-1){
               if(hash[c]>=left){
                   left = hash[c]+1;
               }
           }
           maxLen = Math.max(maxLen,right-left+1);
           hash[c] = right;
           right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(new LongestWithoutRepeating().longest("abcdefa"));
    }
}
