public class Zoho2 {
    public int findTarget(int[] arr, int value){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid] == value){
                return mid;
            }

            if(arr[left]<=arr[mid]){
                if(value>=arr[left] && value<=arr[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else {
                if(value>arr[mid] && value<=arr[right]){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println( new Zoho2().findTarget(arr,4));

    }
}
