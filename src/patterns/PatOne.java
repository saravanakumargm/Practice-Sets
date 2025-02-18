package patterns;

public class PatOne {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int spaces = 1;
        int start = 2;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < spaces*2; j++) {
                System.out.print(" ");
            }
            spaces++;
            for (int j = start; j <=n ; j++) {
                System.out.print(j + " ");
            }
            start++;
            System.out.println();
        }
    }
}
