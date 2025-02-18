import java.util.HashSet;

public class SubArrayToSum {
    static HashSet<Integer> visited = new HashSet<>();
    public static int totalSubArrays(int[] arr, int sum){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==sum){
                count++;
            }
            int value = sum - arr[i];
            if(containsValue(arr,value,i)){
                count++;
            }
        }
        return count;
    }

    private static boolean containsValue(int[] arr, int value, int start) {
        for(int i = start; i<arr.length;i++){
           if(arr[i]==value){
               visited.add(arr[i]);
               return true;
           }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        System.out.println(totalSubArrays(arr,3));
    }
}
