import javax.swing.plaf.IconUIResource;

public class ReverseString1And2 {
    public void reverse(String s1, String s2){
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)==' '){
                count++;
            }
        }
        String[] words = new String[count+1];
        int ind = 0;
        int first=0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)==' '){
                words[ind++] = s1.substring(first,i);
                first = i+1;
            }
        }
        System.out.println(first);
        words[ind] = s1.substring(first,s1.length());
        for(String s : words){
            System.out.print(s + " ");
        }
        for (int i = 0; i < words.length-1; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(j)==s2.charAt(0)){
                    String temp = words[i-1];
                    words[i-1] = words[i+1];
                    words[i+1] = temp;
                }
            }
        }
        for(String s : words){
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {
        new ReverseString1And2().reverse("This is a test String only","St");
    }
}
