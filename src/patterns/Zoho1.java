package patterns;

public class Zoho1 {
    public static void main(String[] args) {
        int n = 5;
        int spaces = n-1;
        int start =1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print("   ");
            }
            spaces--;
            int val = start;
            for (int j = 0; j <n; j++) {
                if(i+j>=n-1){
                    System.out.print(val + " ");
                    val = val-j-1;
                }
            }
            start = start + n-i;
            System.out.println();
        }
    }
}
