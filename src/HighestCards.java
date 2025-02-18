public class HighestCards {
    public int maximumCards(int[] arr,int k){
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;
        for(int i=0;i<k;i++){
            leftSum+=arr[i];
        }
        maxSum = leftSum;
        int rightIndex = arr.length-1;
        for(int i = k-1;i>=0;i--){
            leftSum = leftSum-arr[i];
            rightSum = rightSum + arr[rightIndex--];
            maxSum = Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {6,2,3,4,7,2,1,7,1};
        System.out.println(new HighestCards().maximumCards(arr,4));
    }
}
