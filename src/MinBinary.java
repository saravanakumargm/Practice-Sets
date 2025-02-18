public class MinBinary {
    public void print(int num){
        int last = num%10;
        int res = 0;
        for (int i = 0; i < last; i++) {
            System.out.print(11 + " ");
            res+=11;
        }
        int ten = 10;
        while (res<=num-10){
            System.out.print(10 + " ");
            res+=ten;

        }
    }

    public static void main(String[] args) {
        new MinBinary().print(32);
    }
}
