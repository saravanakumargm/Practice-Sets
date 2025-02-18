public class SumPair {
    public boolean isPresent(int[] arr ,int sum){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] + arr[i+1] == sum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new SumPair().isPresent(new int[]{1,2,2,6,5},5));
    }
}
