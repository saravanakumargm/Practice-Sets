public class ContainsJewels {
    public int contains(String jewels, String stones){
        char[] chars = new char[jewels.length()];
        for (int i = 0; i < jewels.length(); i++) {
            chars[i] = jewels.charAt(i);
        }
        int ind = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < i; j++) {
                if(chars[i]==chars[j]){
                    break;
                }
            }
            chars[ind++] = chars[i];
        }
        int res = 0;
        for (int i = 0; i < stones.length(); i++) {
            if(isThere(chars, stones.charAt(i))){
                res++;
            }
        }
        return res;
    }

    private boolean isThere(char[] chars, char c) {
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==c){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ContainsJewels().contains("aA","aAAbbbb"));
    }
}
