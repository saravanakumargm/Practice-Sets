public class StringWays {
    public int noOfWays(int num){
        int result = 1;
        int len = 0;
        int temp = num;
        while(temp>0){
            len++;
            temp/=10;
        }
        int[] digits = new int[len];
        int left = 0;
        int right = 1;

        while (right<digits.length){
            if(digits[left]*10 + digits[right] <=26){
                result++;
            }
            left++;
            right++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new StringWays().noOfWays(123));
    }
}
