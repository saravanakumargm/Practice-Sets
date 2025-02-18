import java.util.HashMap;

public class StringCompression {
    public static int compress(char[] chars) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : chars){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        String res = "";
        int index = 0;
        for (char c : chars) {
            if(map.containsKey(c)){
                res = res + c;
                if(map.get(c)>1){
                    res+=map.get(c);
                }
                map.remove(c);
            }

        }
        for (int i = 0; i < res.length(); i++) {
            chars[i] = res.charAt(i);
        }
        return res.length();
    }

    public static int compressString(char[] chars) {
        int len = 0;
        char c = chars[0];
        String res = "";
        for (char ch : chars) {
            if(ch!=c){
                res += String.valueOf(c);
                if(len>1){
                    res+=Integer.toString(len);
                }
                c = ch;
                len=1;
            }else{
                len++;
            }
        }
        res+=c;
        res+=Integer.toString(len);
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            chars[index] = res.charAt(index);
            index++;
        }
        for(char ch : chars){
            System.out.print(ch + " ");
        }
        System.out.println(res);
        return res.length();
    }
    public static void main(String[] args) {
        char[] arr = {'a','b','c'};
        System.out.println(compressString(arr));
    }
}
