public class AddDigitToAllDigits {
    public static void main(String[] args) {
        int num = 2875;
        int addDigit = 4;
        String n = Integer.toString(num);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            int digit = Character.getNumericValue(n.charAt(i));
            int sum = digit + addDigit;
            str.append(Integer.toString(sum));
        }
        System.out.println(str.toString());
    }
}
