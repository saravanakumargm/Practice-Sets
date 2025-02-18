public class EqualZeroOne {
    public static int countBinary(String s){
        int previousGroupLength = 0;
        int currentGroupLength = 1;
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentGroupLength++;
            } else {
                count += Math.min(previousGroupLength, currentGroupLength);
                previousGroupLength = currentGroupLength;
                currentGroupLength = 1;
            }
        }
        count += Math.min(previousGroupLength, currentGroupLength);

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBinary("010011010"));//01 10 0011 01 10 01 10
    }
}
