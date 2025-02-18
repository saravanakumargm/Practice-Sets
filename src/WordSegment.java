import java.util.Objects;

public class WordSegment {
    public static void canSegment(String input, String[] dictionary){
        boolean[] dp = new boolean[input.length()+1];
        dp[0] = true;//empty string
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(dp[j] && contains(dictionary,input.substring(j,i))){
                    System.out.println(input.substring(j,i));
                    dp[i] = true;
                    break;
                }
            }
        }
        for(boolean i : dp){
            System.out.print(i + " ");
        }
        System.out.println();
        if(dp[input.length()]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static boolean contains(String[] dictionary, String substring) {
        for (int i = 0; i < dictionary.length; i++) {
            if(Objects.equals(dictionary[i], substring)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] dictionary = {"i", "like", "sam", "sung", "samsung",
                "mobile", "ice", "cream", "icecream",
                "man", "go", "mango"};
        canSegment("ilike",dictionary);
    }
}
