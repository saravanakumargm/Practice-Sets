package patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int n=3;
        int noOfStars = 1;
        int spaces = n;
        for (int i = 1; i <= n*2; i++) {
            if(i<=n-1){
                for (int j = 0; j < spaces; j++) {
                    System.out.print("  ");
                }
                spaces--;
            }else{
                for (int j = 0; j < spaces; j++) {
                    System.out.print("  ");
                }
                spaces++;
            }
            for (int j = 0; j < noOfStars; j++) {
                System.out.print("* ");
            }
            if(i>n-1){
                noOfStars = noOfStars - n+1;
            }else{
                noOfStars = noOfStars+ n -1;
            }
            System.out.println();
        }
    }
}
