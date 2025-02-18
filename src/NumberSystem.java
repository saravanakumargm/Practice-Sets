public class NumberSystem {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int n=4;
        int k=30;
        int m=40;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < n; i++) {
            a += k;//33
            b += k;//34

            System.out.println(a);
            System.out.println(b);
            a -= k;
            b -= k;

            a += m;
            b += m;
            System.out.println(a);
            System.out.println(b);
            k *= 10;
            m *= 10;
        }

    }
}
