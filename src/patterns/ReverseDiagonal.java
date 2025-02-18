package patterns;

public class ReverseDiagonal {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        for (int i = 0; i < n; i++) {
            int value = i+1;
            for (int j = 0; j < n; j++) {
                System.out.print(value + " ");
                value = value + (j+1 )+ i  + 1;
            }
            System.out.println();
        }
    }
}
