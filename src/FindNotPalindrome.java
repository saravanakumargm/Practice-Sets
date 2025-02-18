public class FindNotPalindrome {
    public boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while (start!=end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void find(String str){
        int start = 0;
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                String word = str.substring(start,i);
                if(!isPalindrome(word)){
                    res += word + " ";
                }
                start = i+1;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        new FindNotPalindrome().find("malayalam knows malayalam");
    }
}
