package patterns;

public class LatinMatrix {
    public static void main(String[] args) {
        int n = 3;
        String s = "abc";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                char value = (char) ((s.charAt(i) + (j+i)%(n-1)));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
