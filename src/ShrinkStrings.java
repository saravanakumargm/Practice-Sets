import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;

public class ShrinkStrings {
    public void shrink(String s){
        //xxxxx
        HashMap<Character,Integer> map = new HashMap<>();
        boolean[] visited = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if(visited[i]) continue;
            int count = 0;
            for (int j = i; j <s.length() ; j++) {
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.print(s.charAt(i) + ""+ count);
        }
    }

    public static void main(String[] args) {
        new ShrinkStrings().shrink("xxxxx");
    }
}
