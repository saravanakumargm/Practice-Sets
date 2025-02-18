public class FirstOccuranceOfWord {
    public static void firstOccurrence(String s1, String s2){
        //System.out.println(s1.indexOf(s2));
        int len = s2.length();
        for (int i = 0; i < s1.length()-len+1; i++) {
            String temp = "";
            for (int j = i; j < i+len; j++) {
                temp+=s1.charAt(j);
            }
            if(temp.equals( s2)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        firstOccurrence("hello","ll");
    }
}
