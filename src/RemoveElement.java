import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public int removeElement(int[] nums, int val){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(new RemoveElement().removeElement(arr,val));
        for(int c : arr){
            System.out.print(c);
        }
    }
}
