public class ReplaceWithRightMax {
    public void replace(int[] arr){
        int n = arr.length;
        int maxRight = arr[n-1];
        arr[n-1] = -1;
        for(int i = n-2; i>=0;i--){
            int temp = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight,temp);
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        new ReplaceWithRightMax().replace(arr);
    }
}
