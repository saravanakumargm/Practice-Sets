import java.util.Arrays;

public class MakeTower {
    public void make(int[] arr, int h1, int h2){
        //1 2 3 4 5 6
        Arrays.sort(arr);int res =0;
        for (int i = 0; i < arr.length; i++) {
            res = h1-arr[i];
            if(res==0){
                break;
            }
        }

    }
}
