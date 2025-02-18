package patterns;

public class LookUpAndSay {
    public static void main(String[] args) {
        int n = 5;

        int i =1;
        String s = "1";
        System.out.println(1);
        while (i<n){
            int count  = 1;
            String new_str = "";
            char a = s.charAt(0);
            for (int j = 1; j < s.length(); j++) {
                if(s.charAt(j)!=s.charAt(j-1)){
                    System.out.print(count + "" + a);
                    new_str = new_str + "" + count + "" + a;
                    a = s.charAt(j);
                    count = 1;
                }else{
                    count++;
                }
            }
            System.out.println( count + "" + a);
            new_str = new_str + "" + count + "" + a;
            s = new_str;
            i++;
        }
    }
}
