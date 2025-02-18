import java.lang.reflect.Array;
import java.util.Arrays;

public class FindTopRepeated {
    public static int negate(int x) {//-8
        int neg = 0;
        int sign = x > 0 ? -1 : 1; // Determine the sign to negate sign = 1
        while (x != 0) {
            neg += sign;
            System.out.println("neg " + neg);// neg = 0 + -1 = 1,2,3,4,5,6,7,8  
            x += sign;// x = -8 + 1 = -7,-6,-5,-4,-3,-2,-1,0
            System.out.println("x " + x);
        }
        return neg;
    }
    public static void findRepeated(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int[] indices = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            indices[arr[i]]++;
        }
        int[] topNumbers = new int[3];
        int[] topFrequencies = new int[3];
        for (int i = 0; i < indices.length; i++) {
            int freq = indices[i];
            if (freq > topFrequencies[0]) {
                // Shift down the top three
                topFrequencies[2] = topFrequencies[1];
                topNumbers[2] = topNumbers[1];
                topFrequencies[1] = topFrequencies[0];
                topNumbers[1] = topNumbers[0];
                topFrequencies[0] = freq;
                topNumbers[0] = i;
            } else if (freq > topFrequencies[1]) {
                // Shift down the second and third
                topFrequencies[2] = topFrequencies[1];
                topNumbers[2] = topNumbers[1];
                topFrequencies[1] = freq;
                topNumbers[1] = i;
            } else if (freq > topFrequencies[2]) {
                // Update the third
                topFrequencies[2] = freq;
                topNumbers[2] = i;
            }
        }
        System.out.println(topNumbers[0] + " " + topNumbers[1] + " " + topNumbers[2]);
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
        findRepeated(arr);
        System.out.println(negate(-8));
    }
}
