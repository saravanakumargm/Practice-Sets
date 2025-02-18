import java.util.Arrays;

public class NextGreater {
    public static int find(int[] arr,int ele){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==ele){
                return arr[i+1];
            }
        }
        return -1;
    }
    public static void next(int[] arr){
        int[] sorted = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = find(sorted,arr[i]);
        }
        for(int i:  arr){
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 10, 8, 2, 1, 15, 7};
        next(arr);
    }
}
