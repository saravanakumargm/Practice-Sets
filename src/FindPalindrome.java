public class FindPalindrome {
    public void isPalindrom(int num){
        int reverse = 0;
        int temp = num;
        while (temp>0){
            int last = temp%10;
            reverse = reverse*10 + last;
            temp/=10;
        }
        System.out.println(num==reverse);
    }

    public static void main(String[] args) {
        new FindPalindrome().isPalindrom(123);
    }
}
