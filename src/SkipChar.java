public class SkipChar {
    public void skip(String s, int len){
        for (int i = 0; i < s.length(); i+=len) {
            System.out.print(s.charAt(i));
        }
        System.out.print( " ");
        for (int i = 1; i < s.length(); i+=len) {
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        new SkipChar().skip("Hacker",2);
    }
}
