import com.sun.jdi.connect.Connector;

import java.util.ArrayList;
import java.util.List;

public class PairSum {
    public void findPair(int[] arr, int sum){
        for (int i = 0; i < arr.length; i++) {
            int rem = sum-arr[i];
            int ind = isPresent(arr,rem,i);
            if(ind>0){
                System.out.println((i+1) + " " + (ind+1));
            }
        }
    }

    private int isPresent(int[] arr, int rem, int i) {
        for (int j = i+1; j < arr.length; j++) {
            if(arr[j]==rem){
                return j;
            }
        }
        return -1;
    }
    public  List<int[]> pairSum(int[] arr, int s) {
        List<int[]> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int rem = s - arr[i];
            int ind = isPresent(arr,rem,i);
            if(ind>0){
                ans.add(new int[]{arr[i],arr[ind]});
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,-3,3,3,-1};
        new PairSum().findPair(arr,0);
        List<int[]> res = new PairSum().pairSum(arr,0);
        for(int[] a : res){
            System.out.println(".");
            System.out.println(a[0] + " " + a[1]);
        }
    }
}
