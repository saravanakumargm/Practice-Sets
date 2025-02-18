import patterns.LatinMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumber {
    public void rotate(int[] nums,int k){
        for(int j = 0; j < k; j++){
            int temp = nums[nums.length-1];
            for(int i=nums.length-1;i>=1;i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
        }
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
    ArrayList<String> list = new ArrayList<>();
    private String largest(int[] nums){
        String[] res=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(res,(i, j)-> (j+i).compareTo(i+j));
        if(res[0].equals("0")) return "0";
        StringBuilder s=new StringBuilder();
        for(String n:res) s.append(n);
        return s.toString();
    }

    public static void main(String[] args) {
        int[] arr = {3,30,34,5,9};
        String ans = new LargestNumber().largest(arr);
        System.out.println(ans);
        int[] nums = {1,2};
        new LargestNumber().rotate(nums,3);
    }
}
