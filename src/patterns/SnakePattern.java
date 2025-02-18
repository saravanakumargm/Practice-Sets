package patterns;

public class SnakePattern {
    public static void main(String[] args) {
        int n = 5;
        int k=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2==0){
                    k = k+1;
                    System.out.print(k + " ");
                }else{
                    System.out.print(k + " ");
                    k=k-1;
                }

            }
            k = k+n;
            System.out.println();
        }
    }
}
