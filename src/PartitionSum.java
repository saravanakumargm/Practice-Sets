public class PartitionSum {
    public int partition(int[] arr){
        int leftSum =0 ;
        int rightSum = 0;
        int result = 0;
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for(int j = i; j<n;j++) {
                rightSum += arr[j];
            }
            if(Math.abs(rightSum - leftSum)%2==0){
                result++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new PartitionSum().partition(new int[]{1,3,2,4}));
    }
}
