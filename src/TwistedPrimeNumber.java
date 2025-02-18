public class TwistedPrimeNumber {
    public static boolean isPrime(int num){
        for (int i = 2; i < num/2; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void isTwisted(int num){
        int rev = 0;
        int temp = num;
        while (temp>0){
            int last = temp%10;
            rev = rev*10+last;
            temp/=10;
        }
        if(isPrime(num) && isPrime(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        isTwisted(79);
    }
}
