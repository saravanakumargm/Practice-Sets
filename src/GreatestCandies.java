import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies >=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        List<Boolean> ans  = kidsWithCandies(candies,3);
        for(Boolean b : ans){
            System.out.print(b + " ");
        }
    }
}
