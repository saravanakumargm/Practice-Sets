public class PairProduct {
    public static void pair(int[] arr){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                System.out.println(arr[1] * arr[2]);
            }
            else if(i==n-1){
                System.out.println(arr[n-2]*arr[n-3]);
            }else{
                System.out.println(arr[i-1] * arr[i+1]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-3,2,3,1};
        pair(arr);
    }
}
