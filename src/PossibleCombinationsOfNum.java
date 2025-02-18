public class PossibleCombinationsOfNum {
    public static void countCombination(String num){
        int[] dp = new int[num.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=num.length();i++){
            int singleDigit = num.charAt(i-1) - '0';
            if(singleDigit>0){
                dp[i] += dp[i-1];
            }
            int doubleDigit = Integer.parseInt(num.substring(i-2,i));
            if(doubleDigit>=10 && doubleDigit<=26){
                dp[i] += dp[i-2];
            }
        }
        System.out.println(dp[num.length()]);
    }

    public static void main(String[] args) {;
        countCombination("06");
    }
}
