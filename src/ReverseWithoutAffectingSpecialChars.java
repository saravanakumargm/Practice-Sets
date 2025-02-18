public class ReverseWithoutAffectingSpecialChars {
    public String reverse(String str){
        int left = 0;
        int right = str.length()-1;
        char[] chars = str.toCharArray();
        while (left<right){
            if(Character.isLetter(chars[left]) && Character.isLetter(chars[right])){
                char c = chars[left];
                chars[left] = chars[right];
                chars[right] = c;
            }
            left++;
            right--;
        }
        String res = "";
        for(char c : chars){
            res+=c;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWithoutAffectingSpecialChars().reverse("a,b$c"));
    }
}
