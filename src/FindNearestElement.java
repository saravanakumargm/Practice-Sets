public class FindNearestElement {
    int min = Integer.MAX_VALUE;
    int ind = 0;
    public void find(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(target - arr[i] > 0){
                if(target - arr[i] <min){
                    min = target - arr[i];
                    ind = i;
                }
            }
        }
        System.out.println(arr[ind]);
    }

    public static void main(String[] args) {
        int[] ar = {3,5,8,10,27,36,40,49};
        new FindNearestElement().find(ar,14);
    }
}
