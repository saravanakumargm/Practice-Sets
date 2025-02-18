public class MoveZero {
    public static void main(String[] args) {
        int[] a = {1,0,2,0,4,5};
        int j = -1;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            for(int k : a){
                System.out.println(a);
            }
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        for(int k : a){
            System.out.print(k + " ");
        };
    }
}
