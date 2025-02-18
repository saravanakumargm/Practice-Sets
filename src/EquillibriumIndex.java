public class EquillibriumIndex {
    public int equilibrium(int[] arr){
        int totalSum = 0;
        int leftSum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            totalSum+=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if(totalSum==leftSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-7,1,5,2,-4,3,0};
        System.out.println( new EquillibriumIndex().equilibrium(arr));
    }
}
