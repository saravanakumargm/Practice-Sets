import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class FirstLargeSecondSmall {

    public void alternate(int[] arr){
        int pos = 0;
        for( pos=0;pos<arr.length;pos+=2){
            int temp = arr[arr.length-1];
            for (int i =arr.length-1; i>pos; i--) {
                arr[i] = arr[i-1];
            }
            arr[pos] = temp;
        }
        for(int i: arr){
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
         new FirstLargeSecondSmall().alternate(arr);

    }
}
