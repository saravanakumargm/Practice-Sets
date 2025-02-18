package patterns;

public class Diamond {
    public static void main(String[] args) {
        
        int n = 4;
        int spaces = n-1;
        for (int i = 1; i <= n; i++) {
            int value = i*(i+1)/2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            for (int j = 0; j <i; j++) {
                System.out.print(value-- + " ");
            }
            System.out.println();
        }
        spaces = 0;
        for (int i = n; i >=1; i--) {
            int value = i*(i+1)/2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            spaces++;
            for (int j = 0; j < i; j++) {
                System.out.print( value-- + " ");
            }
            System.out.println();
        }
    }
}
