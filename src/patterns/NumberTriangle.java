package patterns;

public class NumberTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print(j+1);
            }
            for (int k=i-1;k>=0;k--){
                System.out.print(k+1);
            }
            System.out.println();
        }
    }
}
