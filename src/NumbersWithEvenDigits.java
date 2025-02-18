public class NumbersWithEvenDigits {
    public static int noOfDigits(int num){
        int count = 0;
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }
    public static void printNumbers(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(noOfDigits(arr[i])%2==0){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {123,4567,89,1001,22};
        printNumbers(arr);
    }
}
