public class MaxSumSubArray {
    public static int maxSub(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSub(arr));
    }
}
